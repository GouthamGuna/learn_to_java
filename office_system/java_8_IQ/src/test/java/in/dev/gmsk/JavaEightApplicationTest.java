package in.dev.gmsk;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class JavaEightApplicationTest {

    @Test
    void mainTest() {
        assertTrue(true);
    }

    @Test
    void testDownload(){

        String URL = "https://youtu.be/d86ws7mQYIg?si=FdWenWOTqmpraetQ";// "https://youtu.be/zA8guDqfv40?si=JHDDikjqUkld_MfH";
        File filePath = new File("file:///C:/Users/User/Downloads");

        assertNotNull(URL);
        assertNotNull(filePath);

        // assertThrows(Exception.class, () -> JavaEightApplication.download(URL, filePath));

        JavaEightApplication.download(URL, filePath);
    }
}