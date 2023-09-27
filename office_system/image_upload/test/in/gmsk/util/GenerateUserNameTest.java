package in.gmsk.util;

import org.junit.jupiter.api.Test;

class GenerateUserNameTest {

    @Test
    void getName() {
        String output = GenerateUserName.getName();
        System.out.println("output = " + output);
    }
}