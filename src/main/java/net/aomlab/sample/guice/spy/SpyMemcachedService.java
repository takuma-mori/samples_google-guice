package net.aomlab.sample.guice.spy;

import com.google.inject.Inject;
import com.google.inject.Injector;
import net.spy.memcached.MemcachedClientIF;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/23
 * Time: 22:33
 * To change this template use File | Settings | File Templates.
 */
public interface SpyMemcachedService {

    @Inject
    public MemcachedClientIF getMemcachedClient();


}
