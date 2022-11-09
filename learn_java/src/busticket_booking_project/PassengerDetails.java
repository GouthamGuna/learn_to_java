package busticket_booking_project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PassengerDetails {

    private int getBusNo;

    private Date date;

    PassengerDetails(){

        try(Scanner scanner=new Scanner(System.in)){

            /*System.out.print("Enter Name : ");
            String passengerName = scanner.next();

            System.out.print("Enter Gender : ");
            String gender = scanner.next();

            System.out.print("Enter Age : ");
            int age = scanner.nextInt();*/

            System.out.print("Enter Date dd-MM-yyyy : ");
            String getDate=scanner.next();

            SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
            date = format.parse(getDate);

            System.out.print("Enter From : ");
            String from = scanner.next();

            System.out.print("Enter To : ");
            String to = scanner.next();

            System.out.print("Enter Bus No : ");
            getBusNo = scanner.nextInt();

        }catch (Exception e){
            System.out.println("Some thing Went Wrong, Try Again Later...");
        }

    }
    public boolean isAvailable(List<BusDetails> setBusData, List<PassengerDetails> setPassengerDate) {

        int capacity=0;

        for(BusDetails bus: setBusData){
            if(bus.getBusNo() == getBusNo){
                capacity=bus.getTotalCapacity();
            }
        }

        int bookingStatus=0;

        for(PassengerDetails booking: setPassengerDate){
            if(booking.getBusNo == getBusNo && booking.date.equals(date)){
                bookingStatus++;
            }
        }
        return bookingStatus < capacity;
    }
}
