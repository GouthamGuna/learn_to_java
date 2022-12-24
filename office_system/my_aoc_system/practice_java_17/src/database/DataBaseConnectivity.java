package database;

import exception.CustomExceptions;

import java.sql.*;
import java.util.logging.Logger;

public class DataBaseConnectivity {

    private static final Logger logger=Logger.getLogger(String.valueOf(DataBaseConnectivity.class));

    static final String DB_URL = "jdbc:mysql://localhost/stannes_mary";
    static final String USER = "root";
    static final String SECRET = "root";
    static final String QUERY = "SELECT `employeecode` FROM `campus_user` WHERE `username`='admin@stannesmaryland'";

    public static void main(String[] args) throws SQLException, CustomExceptions {
        logger.info("Starting");

            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;

        try {
            conn= DriverManager.getConnection(DB_URL, USER, SECRET);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(QUERY);

            while (rs.next()) {
                logger.info("EMPID : " + rs.getInt("employeecode"));
            }

        } catch (SQLException e) {
            throw new CustomExceptions(e);
        }finally {
            assert rs != null;
            rs.close();
            stmt.close();
            conn.close();
        }
        logger.info("end");
    }
}