package in.dev.gmsk.threading;

import in.dev.gmsk.jdbc.JDBCConnection;
import in.dev.gmsk.model.StudentModel;
import in.dev.gmsk.util.SQL_QUERY_CONSTANTS;

import java.lang.annotation.Repeatable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class StudentPlayingThreadClas {

    List<StudentModel> getAllStudentList(JDBCConnection jdbcConnection){

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{

            connection = JDBCConnection.getDataBaseConnection(jdbcConnection);

            pstmt = connection.prepareStatement(SQL_QUERY_CONSTANTS.FETCH_ALL_STUDENT_DETAILS);
            rs = pstmt.executeQuery();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {

            }catch (Exception e){

            }
        }

        return null;
    }
}
