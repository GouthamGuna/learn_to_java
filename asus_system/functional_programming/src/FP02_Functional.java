import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class FP02_Functional {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(12,9,45,24,27,1,2,3,4,5);
        int output = addListOfNumbers(numbers);
        //out.println(output);

        int greatest = numbers.stream()
                .reduce(Integer.MIN_VALUE, (x,y) -> x > y ? x : y);
        out.println(greatest);

        List<Integer> doubleNumbers = doubleList(numbers);
        List<Integer> evenNumbers = evenNumbersList(numbers);
        //out.println(doubleNumbers);
        //out.println(evenNumbers);

        List<String>  courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Docker", "Kubernetes");
        List<Integer> coursesLength = coursesLengthList(courses);
        //out.println(coursesLength);
    }

    private static List<Integer> coursesLengthList(List<String> courses) {
        return courses.stream()
                .map(String::length) // return Stream<R>
                .collect(Collectors.toList());
    }

    private static List<Integer> evenNumbersList(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x % 2 == 0) // return Stream<T>
                .collect(Collectors.toList());
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
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
