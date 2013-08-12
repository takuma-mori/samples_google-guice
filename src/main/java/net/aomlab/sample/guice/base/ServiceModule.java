package net.aomlab.sample.guice.base;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.Singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/09
 * Time: 20:00
 * To change this template use File | Settings | File Templates.
 */
public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Service.class).to(ServiceImpl.class);
    }
}