package net.aomlab.sample.guice.spy;

import net.spy.memcached.BinaryConnectionFactory;
import net.spy.memcached.MemcachedClient;
import net.spy.memcached.MemcachedClientIF;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/23
 * Time: 22:34
 * To change this template use File | Settings | File Templates.
 */
public class SpyMemcachedServiceImpl  implements SpyMemcachedService{

    @Override
    public MemcachedClientIF getMemcachedClient() {
        MemcachedClientIF memcachedClient = null;
        //List<InetSocketAddress> list = Arrays.asList(InetSocketAddress.createUnresolved("10.200.48.11", 11211));
        try {
            memcachedClient = new MemcachedClient(new BinaryConnectionFactory(), Arrays.asList(new InetSocketAddress("10.200.48.11", 11211)));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return memcachedClient;
    }
}
