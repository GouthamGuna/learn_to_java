package in.dev.gmsk.threading;

import in.dev.gmsk.jdbc.JDBCConnection;
import in.dev.gmsk.model.StudentModel;
import in.dev.gmsk.util.SQL_QUERY_CONSTANTS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentPlayingThreadClass {

    static List<StudentModel> getAllStudentList(JDBCConnection jdbcConnection) {

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        List<StudentModel> returnList = new ArrayList<>();
        StudentModel studentModel;

        try {

            connection = JDBCConnection.getDataBaseConnection(jdbcConnection);

            pstmt = connection.prepareStatement(SQL_QUERY_CONSTANTS.FETCH_ALL_STUDENT_DETAILS);
            rs = pstmt.executeQuery();

            while (rs.next()) {

                studentModel = new StudentModel();
                studentModel.setId(rs.getString("id"));
                studentModel.setName(rs.getString("stuName"));
                studentModel.setAdmissionNo(rs.getString("admissionno"));
                studentModel.setGender(rs.getString("gender"));
                studentModel.setDob(rs.getString("dateofbirth"));
                studentModel.setStudentAvatar(rs.getString("studenturl"));

                returnList.add(studentModel);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(null != rs && !rs.isClosed()){
                    rs.close();
                }
                if(null != pstmt && !pstmt.isClosed()){
                    pstmt.close();
                }
                if(null != connection && !connection.isClosed()){
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return returnList;
    }
}
