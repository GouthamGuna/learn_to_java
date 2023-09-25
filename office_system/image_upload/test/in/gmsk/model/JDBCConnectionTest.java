package in.gmsk.model;

import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class JDBCConnectionTest {

    @Test
    void getSeparateConnection() {
        Connection conn = null;
        PreparedStatement prestmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCConnection.getSeparateConnection();
            String query = "SELECT CONCAT(`firstname`,'',`lastname`) AS studentname FROM `student_registration`;";
            prestmt = conn.prepareStatement(query);
            rs = prestmt.executeQuery();

            while (rs.next()) {
                System.out.println("Output : " + rs.getString("studentname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != rs && !rs.isClosed()) {
                    rs.close();
                }
                if (null != prestmt && !prestmt.isClosed()) {
                    prestmt.close();
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