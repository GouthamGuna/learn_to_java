package in.dev.gmsk.service;

import in.dev.gmsk.model.Students;
import in.dev.gmsk.repository.StudentRepo;

import java.util.stream.Stream;

public class StudentServiceImpl {

    private static final StudentRepo STUDENT_REPO = new StudentRepo();

    public String saveStudentData(Students student) {
        return STUDENT_REPO.saveStudents( student );
    }

    public Stream<Students> getAllStudentsList() {
        return STUDENT_REPO.getAllStudents();
    }
}
