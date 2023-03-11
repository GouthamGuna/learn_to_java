package in.cerpsoft.app.controller;

import in.cerpsoft.app.dto.SchoolDto;
import in.cerpsoft.app.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/schooldetails")
    public List<SchoolDto> findByAll(SchoolDto schoolDto){
        return schoolService.schoolDetailsList();
    }

    @GetMapping("/schooldetails/edit/{id}")
    public ResponseEntity<SchoolDto> findById(@PathVariable("id") int id,
                                              @RequestBody SchoolDto schoolDto){
        return new ResponseEntity<>(schoolService.getSchoolById(id), HttpStatus.OK);
    }

    @PutMapping("/schooldetails/update/{id}")
    public ResponseEntity<SchoolDto> upDateSchoolDetails(@RequestBody SchoolDto schoolDto,
                                                         @PathVariable("id") int id){
        return new ResponseEntity<>(schoolService.upDateSchoolDetails(schoolDto, id), HttpStatus.OK);
    }

    @DeleteMapping("/schooldetails/delete/{id}")
    public ResponseEntity<String> deleteSchoolData(@PathVariable("id") int id){
        schoolService.deleteSchoolDetails(id);
        return new ResponseEntity<>("School Details Deleted Successfully...", HttpStatus.OK);
    }
}
