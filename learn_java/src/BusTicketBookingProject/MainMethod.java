package BusTicketBookingProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {

        List<BusDetails> setBusData= new ArrayList<>();
        List<PassengerDetails> setPassengerDate=new ArrayList<>();

        setBusData.add(new BusDetails(221,"Lakshmi Transport", "NonAc", 56));
        setBusData.add(new BusDetails(222,"Lakshmi Transport", "NonAc", 56));
        setBusData.add(new BusDetails(223,"Lakshmi Transport", "NonAc", 56));
        setBusData.add(new BusDetails(224,"Lakshmi Transport", "NonAc", 56));
        setBusData.add(new BusDetails(225,"Lakshmi Transport", "NonAc", 56));

        for(BusDetails splitBusData: setBusData) {
            System.out.println(splitBusData);
        }

        System.out.println("------------------------------------------------------------------------------------------------------");

        Scanner scanner=new Scanner(System.in);

        System.out.println("Ticket Booking Enter 1 to Continuous : ");
        int getStatus=scanner.nextInt();

        if(getStatus == 1){
            PassengerDetails savePassenger=new PassengerDetails();

            if(savePassenger.isAvailable(setBusData,setPassengerDate)){
                setPassengerDate.add(savePassenger);
                System.out.println("Ticket are Available...");
            }else{
                System.out.println("Sorry tickets are Full in this bus try another date...");
            }

        }else{
            System.out.println("Thanks to Visit the Website...");
        }
    }
}
