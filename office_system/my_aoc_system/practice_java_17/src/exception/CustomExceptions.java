package exception;

import java.sql.SQLException;
import java.util.logging.Logger;

public class CustomExceptions extends Exception{

    private static final Logger LOGGER=Logger.getLogger(String.valueOf(CustomExceptions.class));

    public CustomExceptions(SQLException ignoredE) {
        LOGGER.info("Some Thing Wrong!");
    }
}
