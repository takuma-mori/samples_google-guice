package net.aomlab.sample.guice.bindinstance;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/10
 * Time: 2:24
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationConfigurationTest {

    @Test
    public void applicationConfigurationTest() {
        Injector injector = Guice.createInjector(new ApplicationConfigurationModule());
        ApplicationConfiguration applicationConfiguration = injector.getInstance(ApplicationConfiguration.class);
        assertEquals("app_x", applicationConfiguration.getApplicationId());
        assertEquals("intellij community", applicationConfiguration.getApplicationName());
    }
}
