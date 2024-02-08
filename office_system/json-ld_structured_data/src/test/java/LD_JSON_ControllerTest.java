import in.dev.gmsk.controller.LD_JSON_Controller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LD_JSON_ControllerTest {

    @Test
    void getLdJsonObject() throws Exception {
        String result = LD_JSON_Controller.getLdJsonObject();
        assertNotNull(result);
        System.out.println("result = " + result);
    }

    @Test
    void validateSymbol() {
        String s = "\u0040";
        System.out.println("s = " + s);
    }
}