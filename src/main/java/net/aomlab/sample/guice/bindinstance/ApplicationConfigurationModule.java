package net.aomlab.sample.guice.bindinstance;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/10
 * Time: 2:20
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationConfigurationModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("APPLICATION_ID")).toInstance("app_x");
        bind(String.class).annotatedWith(Names.named("APPLICATION_NAME")).toInstance("intellij community");
        bind(Long.class).toInstance(System.currentTimeMillis());
    }
}
