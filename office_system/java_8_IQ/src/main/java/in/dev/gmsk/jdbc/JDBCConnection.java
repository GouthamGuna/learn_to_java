package in.dev.gmsk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *    private static final String url = "jdbc:mysql://localhost:3306/pearl";
 *    private static final String user = "root";
 *    private static final String password = "root";
 */

public class JDBCConnection {

    private final String url;
    private final String user;
    private final String password;

    public JDBCConnection(String url, String userName, String password) {
        this.url = url;
        this.user = userName;
        this.password = password;
    }

    public static Connection getDataBaseConnection(JDBCConnection jdbcConnection) throws SQLException {
        return DriverManager.getConnection(jdbcConnection.url, jdbcConnection.user, jdbcConnection.password);
    }
}
