package in.dev.gmsk.abstraction;

public class MyClass implements MyInterface{

    @Override
    public void methodA() {
        System.out.println("I am methodA return type is void.");
    }

    @Override
    public int methodB() {
        return 1998;
    }

    @Override
    public String methodC(double x, double y) {
        return "x = " + x + ", y = " + y;
    }
}
