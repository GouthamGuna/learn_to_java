package vending_machine;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class VendingMachineServiceImpl implements VendingMachineService{

    /*
    * @author gowtham sankar
    */

    private int qty = 0;

    @Override
    public void serviceProvider() {

        List<String> addService = List.of("Coffee : 1", "Tea : 2", "Milk : 3", "Almond Milk : 4", "Warm Water : 5");

        addService.forEach(out::println);
    }

    @Override
    public void serviceNumber(int input) {
        outletDelivery(serviceNameMapper(input),
                askToQuantity(serviceNameMapper(input), serviceAmountMapper(input)), qty
        );
    }

    private int askToQuantity(String s, int amount) {

        Scanner scanner = new Scanner(System.in);
        out.print("   Enter quantity of " + s +" : ");
        qty = scanner.nextInt();

        return calculateTotalAmount(qty, amount);
    }

    @Override
    public int serviceAmountMapper(int serviceNo) {

        HashMap<Integer, Integer> addAmount = new HashMap<>();
        addAmount.put(1, 15);
        addAmount.put(2, 10);
        addAmount.put(3, 15);
        addAmount.put(4, 25);
        addAmount.put(5, 5);

        return addAmount.getOrDefault(serviceNo, 0);
    }

    @Override
    public String serviceNameMapper(int key) {

        HashMap<Integer, String> addValue = new HashMap<>();
        addValue.put(1, "Coffee");
        addValue.put(2, "Tea");
        addValue.put(3, "Milk");
        addValue.put(4, "Almond Milk");
        addValue.put(5, "Warm Water");

        return addValue.getOrDefault(key, "Something went wrong");
    }

    @Override
    public int calculateTotalAmount(int qty, int amount) {
        return qty * amount;
    }

    @Override
    public void outletDelivery(String serviceName, int amount, int qty) {
        out.println("   "+serviceName +" 1 * "+ qty +" Rs : "+amount);
    }
}
