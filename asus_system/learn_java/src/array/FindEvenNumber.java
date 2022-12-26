package array;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumber {
    public static void main(String[] args) {

        // create input list
        List<Integer> number = Arrays.asList(1,2,3,4,5,6);

        //find even number print them
        //get stream out of list
        //filter only even number
        //print each element

        //num -> num % 2 == 1 return value is AddNumber
        number.stream().filter(num -> num  % 2 == 0).forEach(System.out::print);
    }
}
