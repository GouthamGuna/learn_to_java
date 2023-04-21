package service.serviceImpl;

import org.junit.jupiter.api.Test;

class StudentServiceImplTest {

    @Test
    void createStudentList() {

        StudentServiceImpl obj = new StudentServiceImpl();
        obj.createStudentList();
        obj.subjectMappingStudent();
    }
}