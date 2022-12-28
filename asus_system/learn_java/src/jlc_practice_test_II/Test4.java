package jlc_practice_test_II;

public class Test4 {
    public static void main(String[] args) {
        if(m1() || m2()) {
            System.out.println("if");
        } else{
            System.out.println("else");
        }
    }
    static boolean m1(){
        System.out.println("m1");
        return true;
    }
    static boolean m2(){
        System.out.println("m2");
        return false;
    }
}
