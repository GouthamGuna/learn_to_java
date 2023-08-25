package array;

public class PassArray {

    static void vaTest(int v[]){

        System.out.print("Number of args : "+ v.length + " Contents : ");

        for(int x : v){
            System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // How an array must be create to hold the arguments

        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] n3 = {};

        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
