package in.dev.gmsk.ocp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaConcurrency {

    /*
    *    Java Study Guide OCP "Real World Scenario: Avoiding Stateful Streams"
    *
    *    stream should not modify external to pipeline objects.
    *    Ideally pipeline should get a value, reduce it, and return a result, for example, do not accumulate in some external collection.
    * */

    public static List<Integer> addValues(IntStream source) {

        List<Integer> data = Collections.synchronizedList(new ArrayList<>());

        System.out.println("data = " + data);

        source.filter(s -> s % 2 == 0)
                .forEach(data::add); // STATEFUL: DON'T DO THIS! .forEach(i -> { data.add(i); });

        return data;
    }

    /* A much better name would be */

    public static List<Integer> muchBetterAddValues(IntStream stream){
        return stream.filter(JavaConcurrency::isEven).boxed().collect(Collectors.toList());
    }

    private static boolean isEven(int n){
        return (n % 2 == 0); //(n & 1) == 0
    }
}
