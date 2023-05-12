package com.cerpsoft.repository;

import com.cerpsoft.config.JDBCConnection;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class AuthorizedUserRepository {

    public String authorizationUserNameAndPassword(String username, String password) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String empId = "Incorrect UserName and Password!";

        try{
            conn = JDBCConnection.getClientDBConnection();
            stmt = conn.prepareStatement("SELECT `userCode` FROM `ai_user` WHERE `username` = ? AND `password` = ?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            rs = stmt.executeQuery();

            while (rs.next()){
                empId = rs.getString("userCode");
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (rs != null && (!rs.isClosed())) {
                    rs.close();
                }
                if (stmt != null && (!stmt.isClosed())){
                    stmt.close();
                }
                if(conn != null && (!conn.isClosed())){
                    conn.isClosed();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return empId;
    }
}
