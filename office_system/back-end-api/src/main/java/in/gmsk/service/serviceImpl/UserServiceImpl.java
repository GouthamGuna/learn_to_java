package in.gmsk.service.serviceImpl;

import in.gmsk.entity.UserEntity;
import in.gmsk.repository.UserRepository;
import in.gmsk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

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
}