package vending_machine;

public interface VendingMachineService {

    /*
     * @author gowtham sankar
     */

    void serviceProvider();

    void serviceNumber(int input);

    int serviceAmountMapper(int serviceNo);

    String serviceNameMapper(int key);

    int calculateTotalAmount(int qty, int amount);

    void outletDelivery(String serviceName, int amount, int qty);
}
