import java.util.List;

import static java.lang.System.*;

public class FP02_Structured {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(12,9,45,24,27,1,2,3,4,5);
        addListOfNumbers(numbers);
    }

    private static void addListOfNumbers(List<Integer> numbers) {
        int sum = 0;
        
        for(int i: numbers){
            sum += i;
        }
        out.println(sum);
    }
}
