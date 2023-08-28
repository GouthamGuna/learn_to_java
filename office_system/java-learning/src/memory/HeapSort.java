package memory;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {

        Integer[] integerArr = {1, 4, 3, 2, 64, 3, 2, 4, 5, 5, 2, 12, 14, 5, 3, 0, -1};
        String[] stringArr = {"hope you find this helpful!", "wef", "rg", "q2rq2r", "avs", "erhijer0g", "ewofij", "gwe", "q", "random"};

        integerArr = heapsort(integerArr);
        //stringArr = heapsort(stringArr);
        System.out.println(Arrays.toString(integerArr));
        System.out.println(Arrays.toString(stringArr));
    }

   /* private static Integer[] heapsort(String[] stringArr) {
        return stringArr;
    }*/

    private static Integer[] heapsort(Integer[] integerArr) {
        return integerArr;
    }
}

