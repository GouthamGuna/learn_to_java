package in.cerpsoft.service.serviceImpl;

import in.cerpsoft.dto.Student;
import in.cerpsoft.repository.StudentRepository;
import in.cerpsoft.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }
}
