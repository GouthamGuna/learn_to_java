package in.gmsk.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public final class JDBCConnection {
    private static Logger logger = LoggerFactory.getLogger(JDBCConnection.class);

    private static String DRIVER_NAME = null;
    private static String PROTOCOL = null;
    private static String PORT_NO = null;
    private static String CUSTOM_DATABASE = null;
    private static String IPADDRESS = null;
    private static String USERNAME = null;
    private static String PASSWORD = null;

    static {
        try {
            logger.info("Inside the static block.");

            ResourceBundle bundle = ResourceBundle.getBundle("application");
            DRIVER_NAME = bundle.getString("dataBaseDriver");
            PROTOCOL = bundle.getString("communicationProtocol");
            PORT_NO = bundle.getString("portNo");
            CUSTOM_DATABASE = bundle.getString("custom_DataBase");
            IPADDRESS = bundle.getString("IP_Address");
            USERNAME = bundle.getString("db_userName");
            PASSWORD = bundle.getString("db_Password");

            logger.info("Successfully retrieve the database details.");
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }

    public static Connection getSeparateConnection() {
        logger.info("STARTING...");
        Connection conn = null;
        try {
            String host_URI = PROTOCOL + "://" + IPADDRESS + ":" + PORT_NO + "/" + CUSTOM_DATABASE;

            Class.forName(DRIVER_NAME).newInstance();
            conn = DriverManager.getConnection(host_URI, USERNAME, PASSWORD);
            //conn = DriverManager.getConnection("jdbc:mysql://localhost/gmsk","root", "root");
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        logger.info("ENDED.");
        return conn;
    }
}
