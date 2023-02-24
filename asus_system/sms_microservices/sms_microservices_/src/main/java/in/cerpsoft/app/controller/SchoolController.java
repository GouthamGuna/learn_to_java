package in.cerpsoft.app.controller;

import in.cerpsoft.app.dto.SchoolDto;
import in.cerpsoft.app.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school/api")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }
    @PostMapping("/save")
    public ResponseEntity<SchoolDto> saveSchool(@RequestBody SchoolDto schoolDto){
        return new ResponseEntity<>(schoolService.saveSchoolDetails(schoolDto), HttpStatus.CREATED);
    }
}
