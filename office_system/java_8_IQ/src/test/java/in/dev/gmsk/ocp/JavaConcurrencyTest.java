package in.dev.gmsk.ocp;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

// import static org.junit.jupiter.api.Assertions.*;

class JavaConcurrencyTest {

    @Test
    void addValues() {

        IntStream streamer = IntStream.of(40, 10, 6, 2, 60, 40, 600, 200, 500);

        List<Integer> integers = JavaConcurrency.addValues(streamer);

        System.out.println("integers = " + integers);
    }

    @Test
    void muchBetterAddValues() {

        IntStream streamer = IntStream.of(40, 10, 6, 2, 60, 40, 600, 200, 500);

        List<Integer> integers = JavaConcurrency.muchBetterAddValues(streamer);

        System.out.println("integers = " + integers);
    }

    @Test
    void parallelDemo() {
        JavaConcurrency.parallelDemo();
    }

    @Test
    void howTheStreamsWork(){
        JavaConcurrency.howTheStreamsWork();
    }
}