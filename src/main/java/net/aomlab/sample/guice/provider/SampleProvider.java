package net.aomlab.sample.guice.provider;

import com.google.inject.Inject;
import com.google.inject.Provider;


/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/10
 * Time: 3:14
 * To change this template use File | Settings | File Templates.
 */
public class SampleProvider implements Provider<String> {
    @Override
    public String get() {
        return "hoge";
    }
}
