package in.cerpsoft.app.controller;

import in.cerpsoft.app.model.AcademicYearDto;
import in.cerpsoft.app.service.AcademicYearService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/academicYear")
public class AcademicYearController {
    @Autowired
    private AcademicYearService service;

    public AcademicYearController(AcademicYearService service){
        this.service = service;
    }
    @PostMapping("/save")
    public ResponseEntity< AcademicYearDto > saveAcademicYearDetails(@RequestBody @Valid AcademicYearDto yearDto){
        return new ResponseEntity<>(service.saveAcademicYearDetails(yearDto), HttpStatus.CREATED);
    }
    @GetMapping("/fetchAll")
    public ResponseEntity< List<AcademicYearDto> > getAllAcademicYearList(){
        return ResponseEntity.ok(service.getAllAcademicYearList());
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<AcademicYearDto> getAcademicYearById(@PathVariable int id){
        return new ResponseEntity<>(service.getAcademicYearById(id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<AcademicYearDto> upDateAcademicYear(@RequestBody @Valid AcademicYearDto yearDto,
                                                              @PathVariable int id){
        return new ResponseEntity<>(service.upDateAcademicYearDetails(yearDto, id), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAcademicYear(@PathVariable int id){
        service.deleteAcademicYear(id);
        return new ResponseEntity<>("Academic Year Details Deleted Successfully...", HttpStatus.OK);
    }
}
