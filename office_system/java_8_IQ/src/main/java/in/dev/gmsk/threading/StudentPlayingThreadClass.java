package in.dev.gmsk.threading;

import in.dev.gmsk.jdbc.JDBCConnection;
import in.dev.gmsk.model.StudentModel;
import in.dev.gmsk.util.SQL_QUERY_CONSTANTS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StudentPlayingThreadClass {
    private static final Random RANDOM = new Random();

    static Stream<StudentModel> getAllStudentList(JDBCConnection jdbcConnection) {

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
                if (null != rs && !rs.isClosed()) {
                    rs.close();
                }
                if (null != pstmt && !pstmt.isClosed()) {
                    pstmt.close();
                }
                if (null != connection && !connection.isClosed()) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return returnList.parallelStream().distinct();
    }


    public static String saveEmployee(JDBCConnection jdbcConnection) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String returnString = "Try Again...";
        try {
            int count;
            int lengthOfData = 1;
            connection = JDBCConnection.getDataBaseConnection(jdbcConnection);
            preparedStatement = connection.prepareStatement(SQL_QUERY_CONSTANTS.SAVE_EMPLOYEE);
            preparedStatement.setString(1, getName());
            preparedStatement.setString(2, getDesignation(lengthOfData));
            preparedStatement.setString(3, getGender(lengthOfData));
            preparedStatement.setString(4, getSalary(lengthOfData));
            count = preparedStatement.executeUpdate();

            if (count > 0) {
                returnString = "Successfully saved...";
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (null != preparedStatement && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
                if (null != connection && !connection.isClosed()) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return returnString;
    }

    private static String getName() {

        final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int index = RANDOM.nextInt(ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }

    private static String getDesignation(int length) {

        final String[] genderList = {"Lead Engineer", "Software Engineer", "Manager", "Marking Engineer"};

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(genderList.length);
            builder.append(genderList[index]);
        }
        return builder.toString();
    }

    private static String getGender(int length) {

        final String[] genderList = {"Male", "Female"};

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(genderList.length);
            builder.append(genderList[index]);
        }
        return builder.toString();
    }

    private static String getSalary(int length) {

        final String[] salaryList = {"25000", "35000", "45000", "50000", "60000"};

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(salaryList.length);
            builder.append(salaryList[index]);
        }
        return builder.toString();
    }
}
