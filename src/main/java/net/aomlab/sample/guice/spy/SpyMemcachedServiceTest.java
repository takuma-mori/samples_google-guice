package net.aomlab.sample.guice.spy;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.spy.memcached.MemcachedClient;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/23
 * Time: 22:34
 * To change this template use File | Settings | File Templates.
 */
public class SpyMemcachedServiceTest {

    @Test
    public void test(){
        Injector injector = Guice.createInjector(new SpyMemcachedServiceModule());
        SpyMemcachedService service = injector.getInstance(SpyMemcachedService.class);

        MemcachedClient client = (MemcachedClient) service.getMemcachedClient();

        client.set("key", 10000, "hoge");

    }
}
