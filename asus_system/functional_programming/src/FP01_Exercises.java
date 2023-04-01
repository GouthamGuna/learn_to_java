import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class FP01_Exercises {
    public static void main(String[] args) {

        List<Integer> newList = Arrays.asList(0,1,2,3,4,5,6,7,8,10);
        printOddNumbers(newList);
        printSquaresOfEvenNumbers(newList);

        List<String>  courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Docker");
        printCourses(courses);
        printFourLetters(courses);
    }

    private static void printSquaresOfEvenNumbers(List<Integer> newList) {
        newList.stream()
                .forEach(out::println);
    }

    private static void printFourLetters(List< String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(out::println);
    }

    private static void printCourses(List< String> courses) {

        courses.stream()
                .filter(coursesContains -> coursesContains.contains("Spring"))
                .forEach(out::println);
    }

    private static void printOddNumbers(List< Integer> newList) {

        newList.stream()                                    // stream is a sequence of element
                .filter(oddNumber -> oddNumber % 2 != 0)    // lambda expression
                .forEach(out::println);                     // method reference
    }
}