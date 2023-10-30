package in.dev.gmsk.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class JDBCConnectionTest {

    private static final String url = "jdbc:mysql://localhost:3306/pearl";
    private static final String user = "root";
    private static final String password = "root";
    private static final JDBCConnection jdbcConnection;

    static{
        jdbcConnection = new JDBCConnection(url, user, password);
    }

    @Test
    void getDataBaseConnectionTest() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            String query = "SELECT CONCAT(`firstname`,' ',`lastname`) AS studentName FROM `student_registration`\n";
            conn = JDBCConnection.getDataBaseConnection(jdbcConnection);
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("result : " + rs.getString("studentName"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != rs && !rs.isClosed()) {
                    rs.close();
                }
                if (null != stmt && !stmt.isClosed()) {
                    stmt.close();
                }
                if (null != conn && !conn.isClosed()) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}