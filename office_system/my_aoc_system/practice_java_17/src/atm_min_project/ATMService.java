package atm_min_project;

import java.util.ArrayList;
import java.util.List;

public class ATMService implements ATMFunctions{

    @Override
    public List<String> addService() {

        List<String> atmService=new ArrayList<>();
        atmService.add("Press : 1 ====> Withdraw the Amount");
        atmService.add("Press : 2 ====> Set ATM Pin Number");
        atmService.forEach(System.out::println);
        return atmService;
    }

    @Override
    public void chooseService(int whatYouWant) {

        switch (whatYouWant) {
            case 1 -> System.out.println("Withdraw the Amount");
            case 2 -> System.out.println("Set ATM Pin Number");
            default -> System.out.println("Something Went Wrong!");
        }
    }

}
