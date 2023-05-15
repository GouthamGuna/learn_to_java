package in.gmsk.controller;

import in.gmsk.entity.StudentEntity;
import in.gmsk.entity.UserEntity;
import in.gmsk.service.serviceImpl.UserServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    private final Logger logger =
            LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/register")
    public ResponseEntity<UserEntity> saveUser(@RequestBody @Valid UserEntity entity){
        logger.info("Inside the save user method : {} ", entity);
        return new ResponseEntity<>(userService.createUser(entity), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody UserEntity user){
        logger.info("Inside the login user method : {} ", user);

        String output = userService.findByUser(user.getUserName());

        if(output != null){
            return new ResponseEntity<>(output, HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/studentList")
    public ResponseEntity< List<StudentEntity> > getAllStudentList(){
        return new ResponseEntity<>(userService.allStudentList(), HttpStatus.OK);
    }
    @PutMapping("/student/{id}")
    public ResponseEntity<StudentEntity> UpdateDateStudentDetails(@PathVariable("id") int studentId,
            @RequestBody StudentEntity studentEntity){
        return new ResponseEntity<>(userService.editStudentDetails(studentId, studentEntity), HttpStatus.OK);
    }
}
