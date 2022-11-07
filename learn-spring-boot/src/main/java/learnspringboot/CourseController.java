package learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/course")
    public List<Course> retrieveCourse(){
        return Arrays.asList(
                new Course (1, "Full Stack Java Developer", "in28minutes"),
                new Course (2, "DevOps", "in28minutes"),
                new Course(3,"DevSecOps", "in28minutes"),
                new Course(4,"python", "in28minutes")
        );
    }
}
