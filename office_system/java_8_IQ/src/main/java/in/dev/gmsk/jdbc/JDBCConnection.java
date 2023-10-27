package in.dev.gmsk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

    private static final String url = "jdbc:mysql://localhost:3306/pearl";
    private static final String user = "root";
    private static final String password = "root";

    public static Connection getDataBaseConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
