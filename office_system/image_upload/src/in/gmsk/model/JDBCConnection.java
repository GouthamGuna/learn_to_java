package in.gmsk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.ResourceBundle;

public class JDBCConnection {
    private static Logger logger = LoggerFactory.getLogger(JDBCConnection.class);

    private static String DRIVER_NAME = null;
    private static String PROTOCAL = null;
    private static String PORT_NO = null;
    private static String DATABASE = null;
    private static String IPADDRESS = null;
    private static String USERNAME = null;
    private static String PASSWORD = null;

    static {
        try {
            logger.info("Inside the static block.");
            ResourceBundle bundle = ResourceBundle.getBundle("application");

        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }

    public void getDBConnection() {

        Connection conn = null;


    }
}
