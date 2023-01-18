package atm_min_project;

import java.util.*;
import java.util.function.Predicate;

public class ATMService implements ATMFunctions{

    private static final List<UserPojo> atmUser;
    private static final HashMap<Integer, Integer> validate;
    private static final List<Integer> accountStmt;

    static {
        atmUser = new LinkedList<>();
        validate = new HashMap<>();
        accountStmt = new LinkedList<>();
    }

    @Override
    public void addService() {

        List<String> atmService=new ArrayList<>();
        atmService.add("Press : 1 ====> Check Balance");
        atmService.add("Press : 2 ====> Deposit");
        atmService.add("Press : 3 ====> Withdraw the Amount");
        atmService.add("Press : 4 ====> Add ATM User");
        atmService.add("Press : 5 ====> Account Summary");
        atmService.add("Press : 6 ====> Exit");
        atmService.forEach(System.out::println);
    }

    @Override
    public void chooseService(int whatYouWant) {

        Scanner sc = new Scanner(System.in);
        int balance, withdraw, deposit, dopBalance;

        switch (whatYouWant) {

            case 6 -> System.exit(0);

            case 5 -> {

               /* System.out.print("Enter Your ATM PIN Number : ");
                int secret = sc.nextInt();

                if(validateUsers(secret) !=0) {

                    for(UserPojo pojo: findByUser(secret)) {

                        if(pojo.getAccountNo() == validateUsers(secret)) {
                            System.out.println("Account Holder Name : " + pojo.getUserName());
                            System.out.println("Account No : " + pojo.getAccountNo());
                            System.out.println(" ");
                            System.out.println("Summary : " +accountStmt.contains(secret));
                        }else{
                            System.out.println("Contact Us Bank if your account number is invalid!");
                        }
                    }
                }else {
                    System.out.println("Invalid Pin Try Again Later");
                }*/
                System.out.println("Coming Zone! :-)");
            }

            case 4-> {
                System.out.print("Enter Your Name : ");
                String userName = sc.next();

                if(userName.matches("^[a-zA-Z]*$")) {

                    System.out.print("Enter Your Account No : ");
                    int accNo = sc.nextInt();

                    if (!validate.containsValue(accNo)) {

                        System.out.print("Set ATM Card Pin : ");
                        int secret = sc.nextInt();

                        if (!validate.containsKey(secret)) {

                           // if(countLength(secret) >= 4) {

                                validate.put(secret, accNo);
                                atmUser.add(new UserPojo(userName, accNo, secret, 0, 0));

                                System.out.println("ATM User Added Successfully :-) ");
                          //  }else{
                              //  System.out.println("The pin only contains four numbers.");
                          //  }
                        }else {
                            System.out.println("A Distinct Pin Number. Try Again!");
                        }
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

                    if(withdraw == 500 || withdraw == 1000) {

                        for (UserPojo pojo : findByUser(secret)) {

                            if (pojo.getAccountNo() == validateUsers(secret)) {

                                    if (pojo.getMaxBalance() >= withdraw) {
                                        balance = pojo.getMaxBalance() - withdraw;
                                        System.out.println("Please collect your money");
                                        System.out.println(" ");
                                        System.out.println("Total Amount : " + balance);
                                        pojo.setMaxBalance(balance);
                                    } else {
                                        System.out.println("Insufficient Balance");
                                    }
                            } else {
                                System.out.println("Contact Us Bank if your account number is invalid!");
                            }
                        }
                    }else if(withdraw == 2000 || withdraw == 5000){

                        for (UserPojo pojo : findByUser(secret)) {

                            if (pojo.getAccountNo() == validateUsers(secret)) {

                                    if (pojo.getMaxBalance() >= withdraw) {
                                        balance = pojo.getMaxBalance() - withdraw;
                                        System.out.println("Please collect your money");
                                        System.out.println(" ");
                                        System.out.println("Total Amount : " + balance);
                                        pojo.setMaxBalance(balance);
                                        accountStmt.add(balance);
                                    } else {
                                        System.out.println("Insufficient Balance");
                                    }
                            } else {
                                System.out.println("Contact Us Bank if your account number is invalid!");
                            }
                        }
                    }else{
                        System.out.println("Withdraw amounts between Rs. 500 and 1000 and between Rs. 2000 and 5000 only.");
                    }
                }else {
                    System.out.println("Invalid Pin Try Again Later");
                }
            }

            case 2 -> {
                System.out.print("Enter Your ATM PIN Number : ");
                int secret = sc.nextInt();

                if(validateUsers(secret) !=0) {

                    for(UserPojo pojo:findByUser(secret)) {

                        if(pojo.getAccountNo() == validateUsers(secret)){

                            System.out.println("Account Holder : "+pojo.getUserName());
                            System.out.println("Account No : " + pojo.getAccountNo());
                            System.out.print("Enter money to be deposited : ");
                            deposit = sc.nextInt();

                            if(500 <= deposit) {
                                dopBalance = pojo.getMaxBalance() + deposit;
                                System.out.println("Your Money has been successfully Deposite ");
                                System.out.println(" ");
                                System.out.println("Total Balance : " + dopBalance);
                                pojo.setMaxBalance(dopBalance);
                                accountStmt.add(dopBalance);
                            }else {
                                System.out.println("A Deposit of at least rs.500 is required.");
                            }
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

                    for(UserPojo pojo: findByUser(secret)) {

                        if(pojo.getAccountNo() == validateUsers(secret)) {
                            System.out.println("Account Holder Name : " + pojo.getUserName());
                            System.out.println("Account No : " + pojo.getAccountNo());
                            System.out.println(" ");
                            System.out.println("Balance : " + pojo.getMaxBalance());
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

    @Override
    public int countLength(int secret) {

        int count = 0;

        while (secret != 0){

            secret = secret/10;
            count = count+1;
        }

        return count;
    }
    @Override
    public List<UserPojo> findByUser(int secret) {

        Predicate<? super UserPojo> predicate = userPojo -> userPojo.getAtmSecret() == secret;
        return atmUser.stream().filter(predicate).toList();
    }
}
