package test;

public class SICI {

    public static void calculation(double pr, double t, double rate){

        double sim = (pr * t * rate)/100;
        double com = pr * Math.pow(1.0+rate/100.0,t) - pr;

        System.out.println("Simple Interest="+sim);
        System.out. println("Compound Interest="+com);
    }

    public static void main(String[] args) {
        calculation(11, 8, 1000);
    }
}
