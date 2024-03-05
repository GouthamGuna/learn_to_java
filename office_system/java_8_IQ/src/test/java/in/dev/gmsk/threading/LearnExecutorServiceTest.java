package in.dev.gmsk.threading;

import org.junit.jupiter.api.Test;

import javax.swing.text.html.Option;

import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class LearnExecutorServiceTest {

    @Test
    void findInt() {

        LearnExecutorService service = new LearnExecutorService();

        OptionalInt i = service.findInt("gmsk");

        System.out.println("i = " + i);
    }
}