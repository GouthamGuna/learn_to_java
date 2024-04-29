package in.dev.gmsk.java_8_streams;

import in.dev.gmsk.model.Staff;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static in.dev.gmsk.java_8_streams.Java8BinaryOperator.*;
import static org.junit.jupiter.api.Assertions.*;

class Java8BinaryOperatorTest {

    @Test
    void testSumOfArraysNumbers() {

        int[] nums = {1, 2, 3, 4, 5};

        int actual = sumOfArraysNumbers(nums);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    void testSumArrayOfValues() {

        Integer[] nums = {1, 2, 3, 4, 5};
        int init = -3;

        int actual = sumArrayOfValues(Arrays.asList(nums), init, Integer::sum);
        int expected = 12;

        assertEquals(expected, actual);
    }

    @Test
    void testGetHighestPayStaffUsingComparator() {

        Staff result = getHighestPayStaffUsingComparator();
        assertNotNull(result);
        System.out.println("result = " + result);
    }

    @Test
    void testGetLowestPayStaffList() {
        Staff result = getLowestPayStaffList();
        assertNotNull(result);
        System.out.println("result = " + result);
    }

    @Ignore
    @Test
    void testPrintAverageSalary(){
        //printAvarageSalary(getStaffList());
    }
}