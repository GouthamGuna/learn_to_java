package in.cerpsoft.controller;

import in.cerpsoft.dto.Student;
import in.cerpsoft.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student/api")
public class StudentController {
    @Autowired
    private StudentService service;
    @PostMapping("/save")
    public String saveStudent(@RequestBody Student student){
        service.saveStudent(student);
        return "Successfully Added a New Student";
    }
}
