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

    @Test
    void testStringContains() {
        String db_value_one = "https://raw.githubusercontent.com/CERPSoftwareSolutions/webimage/main/admin.jpg";
        String db_value_two = "";
        String db_value_third  = "C:\\Users\\User\\Desktop\\clientlogo\\CERP.png";
        boolean b = JavaEightApplication.testStringContains(db_value_third);

       assertEquals(true, b);
    }

    @Test
    void countStringObject() {
        JavaEightApplication.countStringObject();
        assertTrue(true);
    }
}