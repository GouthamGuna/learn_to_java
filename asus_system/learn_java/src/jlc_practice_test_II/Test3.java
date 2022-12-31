package jlc_practice_test_II;

public class Test3 {
    public static void main(String[] args) {
        for(int i=0; Hello1.process(i); i++){
            System.out.println(i);
        }
    }
}
class Hello1{
    static boolean process(int x){
        if(x<2){
            return true;
        }else {
            return false;
        }
    }
}
