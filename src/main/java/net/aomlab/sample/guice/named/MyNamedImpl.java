package net.aomlab.sample.guice.named;

import java.lang.annotation.Annotation;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/29
 * Time: 14:13
 * To change this template use File | Settings | File Templates.
 */
public class MyNamedImpl implements MyNamed {

    public MyNamedImpl(String value) {
        this.value = value;
    }

    private final String value;

    @Override
    public String value() {
        return this.value;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return MyNamed.class;
    }

    @Override
    public int hashCode() {
        return (127 * "value".hashCode()) ^ value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyNamed)) {
            return false;
        }

        MyNamed other = (MyNamed) obj;
        return value.equals(other.value());
    }
}