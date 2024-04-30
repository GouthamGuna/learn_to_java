package in.dev.gmsk.service;

import in.dev.gmsk.model.Students;
import in.dev.gmsk.repository.StudentRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class StudentServiceImpl {

    private static final StudentRepo STUDENT_REPO = new StudentRepo();

    public String saveStudentData(Students student) {
        return STUDENT_REPO.saveStudents(student);
    }

    public Stream<Students> getAllStudentsList() {
        return STUDENT_REPO.getAllStudents();
    }

    /**
     * @Pattern(regexp = "\\A(?!\\s*\\Z).+")
     */

    public String getStudentAvatar(int studentId) {

        ConcurrentHashMap<Integer, String> tableOne = new ConcurrentHashMap<>();
        tableOne.put(1, "");
        tableOne.put(2, "(NULL)");
        tableOne.put(3, "null");
        tableOne.put(4, " ");
        tableOne.put(5, "xyz");
        tableOne.put(6, "/SchoolInfo/StudentAvatar/2023-2024/xyz_6.png");
        tableOne.put(7, "/SchoolInfo/StudentAvatar/2023-2024/xyz_7.png");

        return isaBoolean.apply(studentId, tableOne) ? "(NULL)" : tableOne.get(studentId);
    }

    private final BiFunction<Integer, ConcurrentHashMap<Integer, String>, Boolean> isaBoolean = (studentId, tableOne) ->
            tableOne.get(studentId).isEmpty() || (tableOne.get(studentId).isBlank() &&
                    (null != tableOne.get(studentId)) && tableOne.get(studentId).equalsIgnoreCase(" "));

    public Stream<String> getString() {
        return Stream.of("Gowtham", "Sankar", "GMSK", "Mani", "Jay", "Kumar", "saran", "karan");
    }

    public List<Integer> getFeeAmount() {
        return Arrays.asList(1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000);
    }

    public List<Integer> getTransportFee() {
        return Arrays.asList(1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000);
    }
}
