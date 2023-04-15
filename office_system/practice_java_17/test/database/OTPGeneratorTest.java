package database;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;

class OTPGeneratorTest {

    @Test
    void Test() {
        final int Range = 8;
        String output = OTPGenerator.generateOTP(Range);

        out.println(output);
    }

}

