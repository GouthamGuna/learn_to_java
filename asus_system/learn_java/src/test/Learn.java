package test;

public class Learn {
    public static void main(String[] args) {
        int i=11;
        findNumType(i);
    }
    static void findNumType(int val){

        if(val % 2==0){
            System.out.println(val+" This Number is Even no");
        }else {
            System.out.println(val+" This Number is Not Even no");
        }
    }
}
