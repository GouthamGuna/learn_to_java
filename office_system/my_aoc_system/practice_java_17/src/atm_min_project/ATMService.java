package atm_min_project;

import java.util.*;

public class ATMService implements ATMFunctions{

    private static final List<UserPojo> atmUser;
    private static final HashMap<Integer, Integer> validate;
    private static final HashSet<Integer> storeAccountNo;

    static {
        atmUser = new LinkedList<>();
        validate = new HashMap<>();
        storeAccountNo = new HashSet<>();
    }

    @Override
    public void addService() {

        List<String> atmService=new ArrayList<>();
        atmService.add("Press : 1 ====> Check Balance");
        atmService.add("Press : 2 ====> Deposit");
        atmService.add("Press : 3 ====> Withdraw the Amount");
        atmService.add("Press : 4 ====> Add ATM User");
        atmService.add("Press : 5 ====> Exit");
        atmService.forEach(System.out::println);
    }

    @Override
    public void chooseService(int whatYouWant) {

        Scanner sc = new Scanner(System.in);
        double balance = 100.0, withdraw, deposit;

        switch (whatYouWant) {

            case 5 -> System.exit(0);

            case 4-> {
                System.out.print("Enter Your Name : ");
                String userName = sc.next();

                if(userName.matches("^[a-zA-Z]*$")) {

                    System.out.print("Enter Your Account No : ");
                    int accNo = sc.nextInt();

                    if (!storeAccountNo.contains(accNo)) {

                        System.out.print("Set ATM Card Pin : ");
                        int secret = sc.nextInt();

                        storeAccountNo.add(accNo);
                        validate.put(secret, accNo);
                        atmUser.add(new UserPojo(userName, accNo, secret, 0.0, 0.0));
                        System.out.println("ATM User Added Successfully :-) ");

                    } else {
                        System.out.println(" XXXXXX - Account Number has already served another client! Contact Us: Your Bank");
                    }
                }else {
                    System.out.println("Only characters are used in the account holder's name.");
                }
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

                            double dopBalance = pojo.maxBalance() + deposit;
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
