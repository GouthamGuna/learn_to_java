package classloading;

public class SubClass extends SuperClass{

    static {
        System.out.println("subclass init...");
    }

    public static void main(String[] args) {

        System.out.println("Parent class value = " + SuperClass.value);
    }
}
