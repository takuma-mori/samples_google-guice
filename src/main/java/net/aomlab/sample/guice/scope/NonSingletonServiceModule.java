package net.aomlab.sample.guice.scope;

import com.google.inject.AbstractModule;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/10
 * Time: 1:58
 * To change this template use File | Settings | File Templates.
 */
public class NonSingletonServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SingletonService.class).to(SingletonServiceImpl.class);
    }

}
