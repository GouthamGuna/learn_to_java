package in.dev.gmsk.cabs_booking_app;

import java.util.ArrayList;
import java.util.List;

public class CabBookingService {

    private static final List<CabModel> cabsList = new ArrayList<>();
    private static final List<CabModel> cabsBookingHistoryList = new ArrayList<>();
    private static int customersId = 1;

    public static String booking(char pickupPoint, long pickupTime, char dropPoint) {
        int cabsLimits = 4;

        if (cabsList.size() < cabsLimits) {
            cabsList.add(new CabModel());
        }

        int min = Integer.MAX_VALUE;
        CabModel readyCabs = null;

        // t.getDropTime()<=pickupTime && Math.abs(pickupLocation - t.getCurrentLocation()) <= min
        for (CabModel cab : cabsList) {
            if (cab.getDropTime() <= pickupTime && absoluteValue(pickupPoint - cab.getCurrentLocation()) <= min) {

            }
        }

        return "Cab booked successfully. Cab ID: " ;//+ cab.getCabId();
    }

    private static int absoluteValue(int a) {
        return (a < 0) ? -a : a;
    }
}
