package in.cerpsoft.app.controller;

import in.cerpsoft.app.model.SchoolDto;
import in.cerpsoft.app.service.SchoolService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }
    @PostMapping("/save")
    public ResponseEntity<SchoolDto> saveSchoolDetails(@RequestBody @Valid SchoolDto schoolDto){
        return new ResponseEntity<>(schoolService.saveSchoolDetails(schoolDto), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<SchoolDto>> getAllSchoolList(SchoolDto schoolDto){
        return ResponseEntity.ok(schoolService.getAllSchoolList());
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<SchoolDto> getSchoolById(@PathVariable("id") int id,
                                              @RequestBody SchoolDto schoolDto){
        return new ResponseEntity<>(schoolService.getSchoolById(id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<SchoolDto> upDateSchoolDetails(@RequestBody @Valid SchoolDto schoolDto,
                                                         @PathVariable("id") int id){
        return new ResponseEntity<>(schoolService.upDateSchoolDetails(schoolDto, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteSchoolDetails(@PathVariable("id") int id){
        schoolService.deleteSchoolDetails(id);
        return new ResponseEntity<>("School Details Deleted Successfully...", HttpStatus.OK);
    }
}
