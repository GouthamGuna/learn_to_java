package in.gmsk.repository;

import in.gmsk.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepoTest {

    @Autowired
    private StudentRepo studentRepo;
    
    @Test
    public void saveStudent(){

        Student student=Student.builder()
                .first_name("Jay")
                .last_name("kumar")
                .email_id("jaykumar@gmail.com")
                .parent_name("rajan")
                .parent_mobileNo("9876543210")
                .parent_mailId("raja@gmail.com")
                .build();
        
        studentRepo.save(student);
    }
    @Test
    public void printAllStudent(){

        List<Student> retrieve=studentRepo.findAll();

        System.out.println("retrieve = " + retrieve);
    }
    
}