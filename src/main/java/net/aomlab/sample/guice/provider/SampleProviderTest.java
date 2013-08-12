package net.aomlab.sample.guice.provider;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.aomlab.sample.guice.bindinstance.ApplicationConfiguration;
import net.aomlab.sample.guice.bindinstance.ApplicationConfigurationModule;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/10
 * Time: 3:25
 * To change this template use File | Settings | File Templates.
 */
public class SampleProviderTest {

    @Test
    public void sampleProviderTest() {
        Injector injector = Guice.createInjector(new SampleProviderModule());
        SampleProvider provider = injector.getInstance(SampleProvider.class);
        System.out.println(provider.get());
    }

}