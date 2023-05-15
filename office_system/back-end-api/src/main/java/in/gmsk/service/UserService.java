package in.gmsk.service;

import in.gmsk.entity.StudentEntity;
import in.gmsk.entity.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity createUser(UserEntity entity);

    String findByUser(String userName);

    List<StudentEntity> allStudentList();
}
