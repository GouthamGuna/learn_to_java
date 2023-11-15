package in.dev.gmsk.ocp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class JavaConcurrency {

    /*
     *    Java Study Guide OCP "Real World Scenario: Avoiding Stateful Streams"
     *
     *    stream should not modify external to pipeline objects.
     *    Ideally pipeline should get a value, reduce it, and return a result, for example, do not accumulate in some external collection.
     * */

    static List<Integer> addValues(IntStream source) {

        List<Integer> data = Collections.synchronizedList(new ArrayList<>());

        System.out.println("data = " + data);

        source.filter(s -> s % 2 == 0)
                .forEach(data::add); // STATEFUL: DON'T DO THIS! .forEach(i -> { data.add(i); });

        return data;
    }

    /* A much better name would be */

    static List<Integer> muchBetterAddValues(IntStream stream) {
        return stream.filter(JavaConcurrency::isEven).boxed().collect(Collectors.toList());
    }

    private static boolean isEven(int n) {
        return (n % 2 == 0); //(n & 1) == 0
    }


    /* Concurrency and Streams and parallel() */

    static void howTheStreamsWork() {

        Stream<Integer> streamOne = Stream.iterate(0, x -> x + 1);
        System.out.println("streamOne = " + streamOne);

        Stream<Integer> streamTwo = streamOne.limit(100);
        System.out.println("streamTwo = " + streamTwo);

        Stream<Integer> streamThree = streamTwo.peek(n -> show(n, "streamThree"));
        System.out.println("streamThree = " + streamThree);

        Stream<Integer> streamFour = streamThree.parallel();
        System.out.println("streamFour = " + streamFour);

        Stream<Integer> streamFive = streamFour.peek(n -> show(n, "streamFive"));
        System.out.println("streamFive = " + streamFive);

        // For dramatic effect:
        delay(2);
        System.out.println("Calling terminal operation:");
        delay(2);

        streamFive.forEach(n -> {
            delay(1);
            show(n, "terminal");
        });
    }

    private static void show(int n, String label) {
        System.out.println(label + ":\t" + n + "\t" + Thread.currentThread().getName());
    }

    private static void delay(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void parallelDemo() {

        Stream.iterate(0, x -> x + 1)//.parallel()
                .limit(100)
                .forEach(x -> {
                    try {
                        System.out.println("x = " + x);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(x + "\t" + Thread.currentThread().getName());
                    }
                });
    }
}
