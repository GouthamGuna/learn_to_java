package in.dev.gmsk.String;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.*;

class InputFormatTest {

    @Test
    void testGenerateUUID() {

        assertNotNull(InputFormat.generateUUID());
        System.out.println(
                InputFormat.generateUUID()
        );
    }

    @Test
    void testURLEncode() throws MalformedURLException, UnsupportedEncodingException {

        String Base_URL = "http://gowthamguna.in";
        String query_URL = "/login?userName=admin&password=admin123";

        assertNotNull(Base_URL);
        assertNotNull(query_URL);

        System.out.println(
                InputFormat.URLEncode(Base_URL+query_URL)
        );
    }
}