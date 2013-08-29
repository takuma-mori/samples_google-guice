package net.aomlab.sample.guice.spy;

import com.google.inject.AbstractModule;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/23
 * Time: 22:34
 * To change this template use File | Settings | File Templates.
 */
public class SpyMemcachedServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpyMemcachedService.class).to(SpyMemcachedServiceImpl.class);
    }
}
