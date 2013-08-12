package net.aomlab.sample.guice.base;

import com.google.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/09
 * Time: 19:56
 * To change this template use File | Settings | File Templates.
 */
public interface Service {

    @Inject
    public void set (String key, String value);

    @Inject
    public String get (String key);

}