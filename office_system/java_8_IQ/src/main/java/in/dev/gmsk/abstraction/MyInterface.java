package in.dev.gmsk.abstraction;

/**
 *  Interface is like a contract. It's promise to provide certain behaviour's and all classes
 *  Which implements the interface guarantee to also implements to those behaviours.
 *
 *  **** errorLearning : 1
 *
 *  default static void ex(){    // Compiler error illegal access modifier.
 *
 *   }
 *
 *   **** Note:
 *
 *              Java 8 introduced the ability to create a default implementation for interface methods.
 *
 * */

public interface MyInterface {

    void methodA();

    int methodB();

    String methodC(double x, double y);

    default String methodD(){
        return "I am default methodD()";
    }

     static String methodE() {
        return "I am static methodE()";
    }
}
