package net.aomlab.sample.guice.bindinstance;

import com.google.inject.Inject;

import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/10
 * Time: 2:15
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationConfiguration {

    @Inject
    @Named("APPLICATION_ID")
    private String applicationId;

    @Inject
    @Named("APPLICATION_NAME")
    private String applicationName;

    @Inject
    private Long startedTimeMillis;

    public String getApplicationId() {
        return applicationId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public Long getStartedTimeMillis() {
        return startedTimeMillis;
    }
}
