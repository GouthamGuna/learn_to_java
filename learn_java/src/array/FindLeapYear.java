package array;

import java.util.Scanner;

public class FindLeapYear {
    public static void main(String[] args) {

        int year;
        int count = 100;

        for(int i=1; count>=i; i++) {

            System.out.print(i+" ) Enter Year : ");
            Scanner scanner = new Scanner(System.in);
            year = scanner.nextInt();

            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.printf("%d is Neap Year...%n", year);
            } else {
                System.out.printf("%d is Not Neap Year...%n", year);
            }
            System.out.println("--------------------------------------");
        }
    }
}
