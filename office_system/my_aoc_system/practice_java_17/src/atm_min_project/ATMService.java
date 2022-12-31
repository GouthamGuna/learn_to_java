package atm_min_project;

import java.util.*;

public class ATMService implements ATMFunctions{

    private static final List<UserPojo> atmUser;
    private static final HashMap<Integer, Integer> validate;

    static {
        atmUser = new LinkedList<>();
        validate = new HashMap<>();
    }

    @Override
    public List<String> addService() {

        List<String> atmService=new ArrayList<>();
        atmService.add("Press : 1 ====> Check Balance");
        atmService.add("Press : 2 ====> Deposit");
        atmService.add("Press : 3 ====> Withdraw the Amount");
        atmService.add("Press : 4 ====> Add ATM User");
        atmService.add("Press : 5 ====> Exit");
        atmService.forEach(System.out::println);
        return atmService;
    }

    @Override
    public void chooseService(int whatYouWant) {

        Scanner sc = new Scanner(System.in);
        int balance = 100, withdraw, deposit;

        switch (whatYouWant) {

            case 5 -> System.exit(0);

            case 4-> {
                System.out.print("Enter Your Name : ");
                String userName = sc.next();

                System.out.print("Enter Your Account No : ");
                int accNo = sc.nextInt();

                System.out.print("Set ATM Card Pin : ");
                int secret = sc.nextInt();

                atmUser.add(new UserPojo(userName, accNo, secret, 0,0));
                validate.put(secret, accNo);
                System.out.println("ATM User Added Successfully :-) ");
            }

            case 3 -> {
                System.out.print("Enter Your ATM PIN Number : ");
                int secret = sc.nextInt();

                if(validateUsers(secret) != 0) {

                    System.out.println("Account No : " + validateUsers(secret));

                    System.out.print("Enter money to be withdrawn : ");
                    withdraw = sc.nextInt();

                    for(UserPojo pojo: atmUser){

                        if(pojo.accountNo() == validateUsers(secret)){

                            if(pojo.maxBalance() >= withdraw)
                            {
                                balance = pojo.maxBalance() - withdraw;
                                System.out.println("Please collect your money");
                                System.out.println(" ");
                                System.out.println("Total Amount : "+balance);
                            }
                            else {
                                System.out.println("Insufficient Balance");
                            }
                            System.out.println(" ");
                        }else {
                            System.out.println("Contact Us Bank if your account number is invalid!");
                        }
                    }
                }else {
                    System.out.println("Invalid Pin Try Again Later");
                }
            }

            case 2 -> {
                System.out.print("Enter Your ATM PIN Number : ");
                int secret = sc.nextInt();

                if(validateUsers(secret) !=0) {

                    System.out.println("Account No : " + validateUsers(secret));

                    for(UserPojo pojo: atmUser) {

                        if(pojo.accountNo() == validateUsers(secret)){

                            System.out.println("Account Holder : "+pojo.userName());
                            System.out.print("Enter money to be deposited : ");
                            deposit = sc.nextInt();

                            int dopBalance = pojo.maxBalance() + deposit;
                            System.out.println("Your Money has been successfully Deposite ");
                            System.out.println("Total Balance : " + dopBalance);
                            System.out.println(" ");
                        } else {
                            System.out.println("Contact Us Bank if your account number is invalid!");
                        }
                    }
                }else {
                    System.out.println("Invalid Pin Try Again Later");
                }
            }

            case 1 -> {
                System.out.print("Enter Your ATM PIN Number : ");
                int secret = sc.nextInt();

                if(validateUsers(secret) !=0) {

                    for(UserPojo pojo: atmUser) {

                        if(pojo.accountNo() == validateUsers(secret)) {

                            System.out.println("Account Holder : " + pojo.userName());
                            System.out.println("Account No : " + pojo.accountNo());

                            System.out.println("Balance : " + pojo.maxBalance());
                            System.out.println(" ");
                        }else{
                            System.out.println("Contact Us Bank if your account number is invalid!");
                        }
                    }
                }else {
                    System.out.println("Invalid Pin Try Again Later");
                }
            }

            default -> System.out.println("Something Went Wrong!");
        }
    }

    @Override
    public int validateUsers(int secret) {

        return validate.getOrDefault(secret, 0);
    }
}
