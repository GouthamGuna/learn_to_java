package in.dev.gmsk.threading;

import in.dev.gmsk.jdbc.JDBCConnection;
import in.dev.gmsk.model.StudentModel;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

class StudentPlayingThreadClassTest {

    private static final String url = "jdbc:mysql://localhost:3306/krithvik";
    private static final String user = "root";
    private static final String password = "root";
    private static final JDBCConnection jdbcConnection;

    static {
        jdbcConnection = new JDBCConnection(url, user, password);
    }

    @Test
    void getAllStudentListTest() {

        List<StudentModel> allStudentList =
                StudentPlayingThreadClass.getAllStudentList(jdbcConnection).collect(Collectors.toList());

        System.out.println("allStudentList = " + allStudentList);
    }
}