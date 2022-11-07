package BusTicketBookingProject;

import java.util.ArrayList;
import java.util.List;

public class MainMethod {
    public static void main(String[] args) {

        List<BusDetails> setBusData=new ArrayList<BusDetails>();
        setBusData.add(new BusDetails("Lakshmi Transport", "NonAc", 56));
        setBusData.add(new BusDetails("Lakshmi Transport", "NonAc", 56));
        setBusData.add(new BusDetails("Lakshmi Transport", "NonAc", 56));
        setBusData.add(new BusDetails("Lakshmi Transport", "NonAc", 56));
        setBusData.add(new BusDetails("Lakshmi Transport", "NonAc", 56));

        for(BusDetails splitBusData: setBusData) {
            System.out.println(splitBusData);
        }
    }
}
