package vending_machine;

import java.util.Scanner;

import static java.lang.System.*;

public class VendingMachineApplication {

    /*
     * @author gowtham sankar
     */
    
    public static void main(String[] args) {

        VendingMachineServiceImpl appRunner = new VendingMachineServiceImpl();
        int input = 0;
        int counter = 0;

        try(Scanner scanner = new Scanner(System.in)){

            while(true) {
                out.println("---------------------------------------------------------");
                appRunner.serviceProvider();
                out.println("---------------------------------------------------------");
                out.print(++counter + " ) Enter the Service no : ");
                input = scanner.nextInt();

                appRunner.serviceNumber(input);
            }

        }catch (Exception e){
            throw new ExceptionHandler("Service Provider", "Input", input);
        }
    }
}
