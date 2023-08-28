package classloading;

public class ConstClass {

    static {
        System.out.println("ConsClass init!");
    }

    public static final String HELLO_WORLD = "Hello world!";
}
