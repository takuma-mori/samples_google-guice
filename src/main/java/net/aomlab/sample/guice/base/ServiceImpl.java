package net.aomlab.sample.guice.base;

import com.google.inject.Singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/09
 * Time: 19:54
 * To change this template use File | Settings | File Templates.
 */
public class ServiceImpl implements Service {

    private Map<String, String> map = new HashMap<String, String>();

    @Override
    public void set(String key, String value) {
        map.put(key, value);
    }

    @Override
    public String get(String key) {
        return map.get(key);
    }
}
