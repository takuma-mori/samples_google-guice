package net.aomlab.sample.guice.provider;

import com.google.inject.Inject;
import com.google.inject.name.Named;


/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/10
 * Time: 3:24
 * To change this template use File | Settings | File Templates.
 */
public class SampleProviderImpl extends SampleProvider {

    @Inject
    @Named("Sample")
    private String sample;

}