package in.gmsk.service.serviceImpl;

import in.gmsk.entity.StudentEntity;
import in.gmsk.entity.UserEntity;
import in.gmsk.exception.ResourceNotFound;
import in.gmsk.repository.StudentRepository;
import in.gmsk.repository.UserRepository;
import in.gmsk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public UserEntity createUser(UserEntity entity) {
        return userRepository.save(entity);
    }

    @Override
    public String findByUser(String userName) {

        var output = userRepository.findByUserName(userName);

        String status = null;

        for (UserEntity user : output) {
            String name = user.getUserName();
            if (name != null) {
                status = name;
                break;
            }
        }
        return status;
    }

    @Override
    public List<StudentEntity> allStudentList() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity editStudentDetails(int id, StudentEntity studentEntity) {

        StudentEntity exitingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Edit student details ", "Student", id));


        exitingStudent.setStudentName(studentEntity.getStudentName());
        exitingStudent.setClassName(studentEntity.getClassName());
        exitingStudent.setRollNo(studentEntity.getRollNo());

        studentRepository.save(exitingStudent);

        return exitingStudent;
    }

    @Override
    public void deleteStudentDetails(int id) {
        studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Student", "Id", id));
        studentRepository.deleteById(id);
    }


}
