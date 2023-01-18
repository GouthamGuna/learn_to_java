package test;

import java.util.Date;

public class HeapMemoryStatus {
    public static void main(String[] args) {

        Date date=new Date();

        System.out.println("-------------------------------------------------------------");
        System.out.println("Date : " + date);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Total Memory (in bytes) : "+Runtime.getRuntime().totalMemory());
        System.out.println("Free  Memory (in bytes) : "+Runtime.getRuntime().freeMemory());
        System.out.println("Max Memory (in bytes)   : "+Runtime.getRuntime().maxMemory());
        System.out.println("-------------------------------------------------------------");
    }
}
