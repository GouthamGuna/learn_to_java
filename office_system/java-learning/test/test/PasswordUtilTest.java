package test;

import org.junit.jupiter.api.Test;

class PasswordUtilTest {

    @Test
    void encodePassword() {
        String output, password = "gMSK@3210";
        output = PasswordUtil.encodePassword(password);

        System.out.println("output = " + output);
    }
}