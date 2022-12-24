package atm_min_project;

import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) {
        ATMController atmController=new ATMController();

        atmController.addService();
        System.out.println("-----------------------------------------------");

        try(Scanner scanner=new Scanner(System.in)){

            int count = 1000;

            for (int i=1; count>=i; i++) {

                System.out.print("ATM SR NO : "+i+" : Enter Your Service NO : ");
                int serNo = scanner.nextInt();

                atmController.chooseService(serNo);

                System.out.println("-----------------------------------------------");
                atmController.addService();
                System.out.println("-----------------------------------------------");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
