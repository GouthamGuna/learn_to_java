package in.dev.gmsk;

import in.dev.gmsk.model.Employee;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Ignore
    @Test
    void testingJsonAPI() {

        Employee employee = new Employee();
        employee.setId(1111);
        employee.setName("Gowtham Sankar G");
        employee.setGender("Male");
        employee.setDesignation("Software Developer");

        assertNotNull(employee);

        String s = JavaEightApplication.testingJsonAPI(employee);

        System.out.println("s = " + s);
    }

    @Test
    void testFunctionInterface(){

        int i = JavaEightApplication.functionInterfaceAdd(10, 10);
        assertEquals(20, i);
        System.out.println("i = " + i);

        int i1 = JavaEightApplication.functionInterfaceSub(20, 5);
        assertEquals(15, i1);
        System.out.println("i1 = " + i1);


        int i2 = JavaEightApplication.functionInterfaceMultiple(5, 5);
        assertEquals(25, i2);
        System.out.println("i2 = " + i2);

        int i3 = JavaEightApplication.functionInterfaceDived(1000, 2);
        assertEquals(500, i3);
        System.out.println("i3 = " + i3);

        int i4 = JavaEightApplication.functionInterfaceMod(520, 2);
        assertEquals(0, i4);
        System.out.println("i4 = " + i4);
    }
}