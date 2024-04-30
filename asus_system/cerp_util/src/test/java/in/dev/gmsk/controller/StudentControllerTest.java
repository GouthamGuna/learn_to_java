package in.dev.gmsk.controller;

import in.dev.gmsk.model.Students;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {
    private static final StudentController CONTROLLER = new StudentController();

    @Test
    void TestSaveStudent() {

        Students students = new Students();
        students.setName("Manoj N");
        students.setRollNo("16EE507");
        assertNotNull(students);
        String s = CONTROLLER.saveStudent(students);
        System.out.println("s = " + s);
    }

    @Test
    void getAllStudentsList() {
        CONTROLLER.getAllStudentsList().toList().forEach(System.out::println);
        assertTrue(true);
    }

    @Test
    void testGetStudentAvatar() {
        String expected = "(NULL)";
        String actual = CONTROLLER.getStudentAvatar(1);

        assertEquals(expected, actual);
        System.out.println("studentAvatarPath = " + actual);
    }

    @Test
    void testComposeMultiMethodOutput() throws ExecutionException, InterruptedException {
        CONTROLLER.composeMultiMethodOutput();
    }
}