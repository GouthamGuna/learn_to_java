package com.cerpsoft.config;

import com.cerpsoft.dto.ClientDBDetails;
import com.cerpsoft.service.serviceImpl.AuthenticateServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
public class JDBCConnection {

    public static Connection getClientDBConnection() {

        ClientDBDetails clientDBDetails = AuthenticateServiceImpl.loadedClientDataBaseDetails();
        Connection conn = null;

        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            String protocal = "jdbc:mysql";
            String portNo = "3306";

            String URL = protocal +"://"+ clientDBDetails.getDbhost() +":"+ portNo +"/"+ clientDBDetails.getDatabase();

            Class.forName(driverName).newInstance();
            Properties properties = new Properties();
            properties.put("user", clientDBDetails.getDbusername());
            properties.put("password", clientDBDetails.getDbpassword());
            properties.put("useSSL", "false");
            properties.put("noAccessToProcedureBodies","true");
            conn = DriverManager.getConnection(URL, properties);

        }catch (Exception e){
            e.printStackTrace();
        }

        return conn;
    }
}
