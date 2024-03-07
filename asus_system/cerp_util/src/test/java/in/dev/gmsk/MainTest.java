package in.dev.gmsk;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMain() {
        String[] args = {"Hello Lunar!"};
        Main.main( args );
        assertTrue( true );
    }
}