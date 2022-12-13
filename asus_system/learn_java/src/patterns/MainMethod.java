package patterns;

import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {

        try(Scanner scanner=new Scanner(System.in)){
            int count=100;
            for(int i=1; count>=i; i++){

                System.out.println("---------------------------------------------------------------");

                System.out.print(i+" ) Enter Range of Pattern : ");
                int range =scanner.nextInt();

                pattern1(range);
                System.out.println("---------------------------------------------------------------");
                pattern2(range);
                System.out.println("---------------------------------------------------------------");
                pattern4(range);
                System.out.println("---------------------------------------------------------------");
                pattern3(range);
            }

        }catch (Exception e){
            System.out.println("Something went wrong...");
        }
    }
    static void pattern1(int range){
        for(int row=1; row<=range; row++){
            for(int col=1; col<=range; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int range){
        for(int row=1; row<=range; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int range){  // c=range-row+1
        for(int row=1; row<=range; row++){
            for(int col=1; col<=range-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int range){
        for (int row=1; row<=range; row++){
            for (int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
