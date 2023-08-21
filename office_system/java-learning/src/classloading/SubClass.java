package classloading;

public class SubClass extends SuperClass{

    static {
        System.out.println("subclass init...");
    }

    public static int value = 2427;
}
