package atm_min_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMService implements ATMFunctions{

    @Override
    public List<String> addService() {

        List<String> atmService=new ArrayList<>();
        atmService.add("Press : 1 ====> Check Balance");
        atmService.add("Press : 2 ====> Deposit");
        atmService.add("Press : 3 ====> Withdraw the Amount");
        atmService.add("Press : 4 ====> Exit");
        atmService.forEach(System.out::println);
        return atmService;
    }

    @Override
    public void chooseService(int whatYouWant) {

        Scanner sc = new Scanner(System.in);
        int balance = 100, withdraw, deposit;

        switch (whatYouWant) {

            case 4 -> System.exit(0);

            case 3 -> {
                System.out.print("Enter money to be withdrawn : ");
                withdraw = sc.nextInt();

                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println(" ");
            }
            case 2 -> {
                System.out.print("Enter money to be deposited : ");
                deposit = sc.nextInt();

                balance = balance + deposit;
                System.out.println("Your Money has been successfully Deposite ");
                System.out.println("Total Balance : "+ balance);
                System.out.println(" ");
            }
            case 1 -> {
                System.out.println("Balance : "+balance);
                System.out.println(" ");
            }

            default -> System.out.println("Something Went Wrong!");
        }
    }

}
