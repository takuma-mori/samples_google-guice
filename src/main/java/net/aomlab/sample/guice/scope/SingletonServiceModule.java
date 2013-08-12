package net.aomlab.sample.guice.scope;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/09
 * Time: 20:53
 * To change this template use File | Settings | File Templates.
 */
public class SingletonServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SingletonService.class).to(SingletonServiceImpl.class).in(Singleton.class);
    }
}
