package net.aomlab.sample.concurrent.queue;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/09/09
 * Time: 11:50
 * To change this template use File | Settings | File Templates.
 */
public class BlockingQueueTest {

    class Producer implements Runnable {

        private Integer counter = new Integer(0);
        private final BlockingQueue queue;

        Producer(BlockingQueue q) {
            queue = q;
        }

        public void run() {
            try {
                while (true) {
                    queue.put(produce());
                }
            } catch (InterruptedException ex) {
                // ignore
            }
        }

        String produce() {
            String str = new String(String.valueOf(counter));
            counter++;
            System.out.println("produce : hashcode = " + str);
            return str;
        }
    }

    class Consumer implements Runnable {
        private final BlockingQueue queue;

        Consumer(BlockingQueue q) {
            queue = q;
        }

        public void run() {
            try {
                while (true) {
                    consume((String) queue.poll(1000L, TimeUnit.MILLISECONDS));
                }
            } catch (InterruptedException ex) {
                // ignore
            }
        }

        void consume(String str) {
            System.out.println("consume = " + str);
        }
    }

    @Test
    public void hoge() {
        double dob = Math.min(10000, 20 * 50);
        System.out.println(dob);
        BlockingQueue q = new ArrayBlockingQueue(10);
        Producer p = new Producer(q);
        Consumer c1 = new Consumer(q);
        //Consumer c2 = new Consumer(q);
        new Thread(p).start();
        new Thread(c1).start();
        //new Thread(c2).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
