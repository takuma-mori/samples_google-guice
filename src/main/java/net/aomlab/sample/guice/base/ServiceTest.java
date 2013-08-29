package net.aomlab.sample.guice.base;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/09
 * Time: 20:35
 * To change this template use File | Settings | File Templates.
 */
public class ServiceTest {

    @Test
    public void serviceTest() {
        Injector injector = Guice.createInjector(new ServiceModule());
        Service service = injector.getInstance(Service.class);
        service.set("key", "value");
        assertEquals("value", service.get("key"));

        System.out.println(service.getFlag());
    }
}
