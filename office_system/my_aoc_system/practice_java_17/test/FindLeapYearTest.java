import org.junit.jupiter.api.Test;
import update_test.FindLeapYear;

import static org.junit.jupiter.api.Assertions.*;

class FindLeapYearTest {

    @Test
    void leapYearFinder() {
        FindLeapYear instance = new FindLeapYear();
        int year = 2020;
        instance.leapYearFinder(year);
    }
}
