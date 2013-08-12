package net.aomlab.sample.guice.scope;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/09
 * Time: 18:18
 * To change this template use File | Settings | File Templates.
 */
public class SingletonServiceTest {

    @Test
    public void SingletonServiceTest(){
        Injector injector = Guice.createInjector(new SingletonServiceModule());
        SingletonService service = injector.getInstance(SingletonService.class);
        SingletonService service2 = injector.getInstance(SingletonService.class);

        assertTrue(service.getObjectId() == service2.getObjectId());
        assertEquals(service.getStartedTimeMillis(), service2.getStartedTimeMillis());
    }

    @Test
    public void NonSingletonServiceTest() {
        Injector injector = Guice.createInjector(new NonSingletonServiceModule());
        SingletonService service = injector.getInstance(SingletonService.class);
        SingletonService service2 = injector.getInstance(SingletonService.class);

        assertTrue(service.getObjectId() != service2.getObjectId());
    }
}
