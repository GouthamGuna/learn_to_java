package in.dev.gmsk.controller;

import in.dev.gmsk.model.Students;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {
    private static final StudentController CONTROLLER = new StudentController();

    @Test
    void TestSaveStudent() {

        Students students = new Students();
        students.setName( "Manoj N" );
        students.setRollNo( "16EE507" );
        assertNotNull( students );
        String s = CONTROLLER.saveStudent( students );
        System.out.println( "s = " + s );
    }

    @Test
    void getAllStudentsList() {
        CONTROLLER.getAllStudentsList().toList().forEach( System.out::println );
        assertTrue( true );
    }
}