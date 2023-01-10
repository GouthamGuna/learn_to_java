package in.gmsk.repository;

import in.gmsk.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

     List<Student> findByFirstName(String firstName);
     List<Student> findByFirstNameContaining(String name);
     List<Student> findByLastNameNotNull();
     List<Student> findByGuardianName(String name);

     List<Student> findByFirstNameAndLastName(String firstName, String lastName);
}
