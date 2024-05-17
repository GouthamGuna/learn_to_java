package in.dev.gmsk.java_8_streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {

    public static void main(String[] args) {
        withoutExplicitImports();
    }

    public static void withoutExplicitImports() {
        List<?> dates = Stream
                .of(1, 2, 23, 29)
                .map(BigDecimal::new)
                .map(day -> LocalDate.of(
                        2024,
                        new Random().nextInt(11) + 1,
                        day.intValue()))
                .collect(Collectors.toList());

        System.out.println(dates);
    }
}
