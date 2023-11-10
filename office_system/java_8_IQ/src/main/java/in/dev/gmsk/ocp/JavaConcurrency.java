package in.dev.gmsk.ocp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class JavaConcurrency {

    /* Java Study Guide OCP "Real World Scenario: Avoiding Stateful Streams" */

    public List<Integer> addValues(IntStream source) {

        List<Integer> data = Collections.synchronizedList(new ArrayList<>());

        source.filter(s -> s % 2 == 0)
                .forEach(data::add); // STATEFUL: DON'T DO THIS!
        return data;
    }
}
