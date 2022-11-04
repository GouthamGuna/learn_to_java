package array;

public class Average {
    public static void main(String[] args) {
        double[] num ={0.11, 0.12, 0.13, 12.1, 13.2, 21.00};
        double result = 0;

        for(int i=0; i<5; i++){
            result = result + num[i];
        }

        System.out.println("Average is "+ result / 5);
    }
}
