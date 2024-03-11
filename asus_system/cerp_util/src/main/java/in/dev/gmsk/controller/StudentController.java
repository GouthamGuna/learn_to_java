package in.dev.gmsk.controller;

import in.dev.gmsk.model.Students;
import in.dev.gmsk.service.StudentServiceImpl;

import java.util.stream.Stream;

public class StudentController {
    private static final StudentServiceImpl STUDENT_SERVICE = new StudentServiceImpl();

    public String saveStudent(Students student) {
        return STUDENT_SERVICE.saveStudentData( student );
    }

    public Stream<Students> getAllStudentsList() {
        return STUDENT_SERVICE.getAllStudentsList();
    }
}
