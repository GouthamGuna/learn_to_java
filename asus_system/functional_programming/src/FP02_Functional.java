import java.util.List;

import static java.lang.System.out;

public class FP02_Functional {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(12,9,45,24,27,1,2,3,4,5);
        int output = addListOfNumbers(numbers);
        out.println(output);
    }

    private static int addListOfNumbers(List<Integer> numbers) {
       return numbers.stream()
               // .reduce(0, FP02_Functional::sumOfTheNumbers);   //custom function
               //.reduce(0,(x,y) -> x+y);                         //lambda expression
               .reduce(0, Integer::sum);                    //method reference

    }

    private static Integer sumOfTheNumbers(Integer Aggregate, Integer nextNumber) {
        return Aggregate + nextNumber;
    }
}
