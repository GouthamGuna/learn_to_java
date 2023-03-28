import update_test.OddNumber;

import org.junit.jupiter.api.Test;
class OddNumberTest {
    @Test
     void test(){
        OddNumber instance=new OddNumber();
        int input = 1;
        instance.oddNumberTest(input);

        instance.removeSpace();
    }
}