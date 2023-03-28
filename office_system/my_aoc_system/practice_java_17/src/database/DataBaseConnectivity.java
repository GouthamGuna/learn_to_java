package database;

import java.sql.*;
import java.util.logging.Logger;

public class DataBaseConnectivity {

    private static final Logger logger=Logger.getLogger(String.valueOf(DataBaseConnectivity.class));

    static final String DB_URL = "jdbc:mysql://localhost:3306/spring_jpa";
    static final String USER = "root";
    static final String SECRET = "root";
    static final String QUERY = "SELECT `email` FROM `login_user`'";

    public static void main(String[] args) throws SQLException {
        logger.info("DataBase Connected Successfully!");

            Connection conn = null;
            Statement stmt = null;
            //boolean rs = false;
            ResultSet rs = null;

        try {

            conn= DriverManager.getConnection(DB_URL, USER, SECRET);
            stmt = conn.createStatement();
            //rs = stmt.execute(QUERY);
            rs = stmt.executeQuery(QUERY);

            while (rs.next()) {
                logger.info("emailId : " + rs.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            assert rs != null;
            rs.close();
            stmt.close();
            conn.close();
        }
        logger.info("DataBase Connection Closed!");
    }
}