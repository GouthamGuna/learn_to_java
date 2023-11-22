package in.dev.gmsk.tcs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TCSInterviewTest1Test {

    @Test
    void testCountingVowels() {
        String Values = "Gowtham Sankar";
        assertNotNull(Values);

        int i = TCSInterviewTest1.countingVowels(Values);

        assertEquals(4, i);
    }

    @Test
    void countingVowelsImplLambada() {
        String Values = "String";
        assertNotNull(Values);

        Long aLong = TCSInterviewTest1.countingVowelsImplLambada(Values);

        assertEquals(1, aLong);
    }
}