package classloading;

public class SuperClass {

    static {
        System.out.println("Super class init...");
        System.out.println("Sub class value = " +SubClass.value);
    }

    public static int value = 123;
}
