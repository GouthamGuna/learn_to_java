package test;

import java.net.Inet4Address;

public class InternetConnectivityCheck{

    public static void main(String[] args) {

        try {
            Inet4Address address = (Inet4Address) Inet4Address.getByName("www.google.com");

            boolean reachable = address.isReachable(3000);

            if (reachable) {
                System.out.println("Internet is connected");
            } else {
                System.out.println("Internet is not connected");
            }

        }catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }

}
