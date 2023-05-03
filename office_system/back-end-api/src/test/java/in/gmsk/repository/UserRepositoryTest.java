package in.gmsk.repository;

import in.gmsk.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository repository;
    private String userName = "Gowtham";

    @Test
    void test(){
        List<UserEntity> output =  repository.findByUserName(userName);

        output.stream().map(UserEntity::getUserName).forEach(name -> {
            if (name != null) {
                System.out.println("Login");
            } else {
                System.out.println("Invalid username or password.");
            }
        });
    }
}