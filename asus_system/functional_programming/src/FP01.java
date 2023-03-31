import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class FP01 {
    public static void main(String[] args) {

        List<Integer> newList = Arrays.asList(0,1,2,3,4,5,6,7,8,10);

        newList.stream()                                   // stream is a sequence of element
                .filter(evenNumber -> evenNumber % 2 == 0) // lambda expression
                .forEach(out::println);                     // method reference

    }
}