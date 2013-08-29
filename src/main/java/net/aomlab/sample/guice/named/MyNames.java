package net.aomlab.sample.guice.named;

/**
 * Created with IntelliJ IDEA.
 * User: Takuma Mori
 * Date: 13/08/29
 * Time: 14:13
 * To change this template use File | Settings | File Templates.
 */
public class MyNames {
    private MyNames(){}

    public static MyNamed named(String str) {
        return new MyNamedImpl(str);
    }
}
