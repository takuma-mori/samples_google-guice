package net.aomlab.sample.guice.provider;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/10
 * Time: 3:22
 * To change this template use File | Settings | File Templates.
 */
public class SampleProviderModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("Sample")).toProvider(SampleProvider.class);
    }
}
