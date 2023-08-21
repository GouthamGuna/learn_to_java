package classloading;

public class NoInitialization {

    public static void main(String[] args) {

        System.out.println("Super class value = " + SuperClass.value);

        SubClass[] sca = new SubClass[10];

        System.out.println(ConstClass.HELLO_WORLD);
    }
}
