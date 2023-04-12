import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class FP01_Exercises {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6);
        //printOddNumbers(numbers);
        //printSquaresOfEvenNumbers(numbers);
        //printCubeOfOddNumbers(numbers);

        List<String>  courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Docker", "Kubernetes");
        //printCourses(courses);
        //printFourLetters(courses);
        printNumbersOfCharactersInEachCourseName(courses);
    }

    private static void printNumbersOfCharactersInEachCourseName(List<String> courses) {
        courses.stream()
                .map(course -> course +" "+ course.length())
                .forEach(out::println);
    }

    private static void printCubeOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(digit -> digit % 2 != 0)
                .map(digit -> digit * digit * digit)
                .forEach(out::println);
    }

    private static void printSquaresOfEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(digit -> digit % 2 == 0)
                .map(digit -> digit * digit)
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

    private static void printOddNumbers(List< Integer> numbers) {

        numbers.stream()                                    // stream is a sequence of element
                .filter(oddNumber -> oddNumber % 2 != 0)    // lambda expression
                .forEach(out::println);                     // method reference
    }
}