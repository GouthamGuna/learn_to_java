package jlc_practice_test_II;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("main");
        new Test1().show();
        show1();
    }
    void show(){
        System.out.println("show");
    }
    static void show1(){
        System.out.println("static show1");
    }
}
