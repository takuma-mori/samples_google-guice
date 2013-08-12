package net.aomlab.sample.guice.scope;

import com.google.inject.Singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/09
 * Time: 20:44
 * To change this template use File | Settings | File Templates.
 */
public class SingletonServiceImpl implements SingletonService {

    private final long StartedTimeMillis = System.currentTimeMillis();
    private final int objectId = this.hashCode();

    @Override
    public long getStartedTimeMillis() {
        return StartedTimeMillis;
    }

    @Override
    public int getObjectId() {
        return objectId;
    }
}