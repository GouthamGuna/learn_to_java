package in.dev.gmsk;

import in.dev.gmsk.abstraction.MyClass;
import in.dev.gmsk.abstraction.MyInterface;

public class JavaEightApplication {

    public static void main(String[] args) {
        System.out.println("Hello Lunar *)");

        MyInterface object = new MyClass();
        object.methodA();

        System.out.println("methodB() return int = "+object.methodB());

        String output = object.methodC(10.50, 20.50);
        System.out.println("output = " + output);

        System.out.println(object.methodD());
    }
}
