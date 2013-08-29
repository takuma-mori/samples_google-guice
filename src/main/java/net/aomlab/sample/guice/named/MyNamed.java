package net.aomlab.sample.guice.named;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/29
 * Time: 14:12
 * To change this template use File | Settings | File Templates.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@com.google.inject.BindingAnnotation
public @interface MyNamed {
    String value();
}
