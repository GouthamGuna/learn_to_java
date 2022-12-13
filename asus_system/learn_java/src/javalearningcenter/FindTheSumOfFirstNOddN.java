package javalearningcenter;

import java.util.Scanner;

public class FindTheSumOfFirstNOddN {
    public static void main(String[] args) {

        int count = 100;
        int sum = 0;

        try(Scanner scanner=new Scanner(System.in)){

            for(int i = 0; i <= count; i++) {

                System.out.println("------------------------------------------");
                System.out.print("Enter the Number : ");
                int n = scanner.nextInt();

                for (int j = 0; j <= n; j++) {

                    if (j % 2 !=0) {
                        sum = sum + j;
                        System.out.println("sum of first " + n + " odd number's " + sum);
                    }
                }
            }

        }catch (Exception e){
            System.out.println("Something Went Wrong...");
        }
    }
}
