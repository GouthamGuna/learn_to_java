import java.util.List;

import static java.lang.System.out;

public class FP02_Functional {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(12,9,45,24,27,1,2,3,4,5);
        addListOfNumbers(numbers);
    }

    private static void addListOfNumbers(List<Integer> numbers) {
        numbers.stream()
                .map(number -> number + number)
                .forEach(out::println);
    }
}
