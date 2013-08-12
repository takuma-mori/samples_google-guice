package net.aomlab.sample.guice.scope;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/09
 * Time: 20:41
 * To change this template use File | Settings | File Templates.
 */
interface SingletonService {

    @Inject
    public long getStartedTimeMillis();

    @Inject
    public int getObjectId();

}
