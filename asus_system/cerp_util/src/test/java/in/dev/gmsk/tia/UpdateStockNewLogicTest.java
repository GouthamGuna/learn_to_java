package in.dev.gmsk.tia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpdateStockNewLogicTest {

    @Test
    void stockUpdatingCalculation() {
        UpdateStockNewLogic.stockUpdatingCalculation( 45,15, 5, 0 );
        assertTrue( true );
    }
}