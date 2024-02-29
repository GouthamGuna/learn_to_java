package in.dev.gmsk.util;

public class SQL_QUERY_CONSTANTS {

    public static final String FETCH_ALL_STUDENT_DETAILS = "SELECT `id`, CONCAT(`firstname`,' ',`lastname`) AS stuName, `gender`, `dateofbirth`, `studenturl`, `admissionno` FROM `student_registration`";
    public static final String SAVE_EMPLOYEE = "INSERT INTO `employee` (`name`, `designation`, `gender`, `salary`) VALUES(?,?,?,?)";
}
