package test;

public class FindPrimeNo {

    public static void isPrimeNo(int no){

        boolean flag = false;

        for(int i = 2; i <= no / i; i++){

            // condition for nonPrime number

            if(no % i == 0){
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(no + " is a prime number.");
        else
            System.out.println(no + " is not a prime number.");

    }

    public static void printContinuousPrimeNo(int no){

        int count;

        for(int i = 1; i <= no; i++){

            count = 0;

            for(int j = 2; j <= i / 2; j++){

                if(i % j == 0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println(i);
            }

        }
    }
    public static void main(String[] args) {
        isPrimeNo(4);
        printContinuousPrimeNo(20);
    }
}
