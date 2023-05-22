package in.cerpsoft.app.controller;

import in.cerpsoft.app.model.SectionDto;
import in.cerpsoft.app.service.SectionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/section")
public class SectionController {
    @Autowired
    private SectionService service;

    public SectionController(SectionService service){
        this.service=service;
    }
    @PostMapping("/save")
    public ResponseEntity< SectionDto > saveSectionDetails(@RequestBody @Valid SectionDto dto){
        return new ResponseEntity<>(service.saveSectionDetails(dto), HttpStatus.CREATED);
    }
    @GetMapping("/fetchAll")
    public ResponseEntity<List<SectionDto> > getAllSchoolList(){
        return ResponseEntity.ok(service.getAllSectionList());
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity< SectionDto > getSectionById(@PathVariable int id){
        return new ResponseEntity<>(service.getSectionById(id), HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity< SectionDto > upDateSectionDetails(@RequestBody @Valid SectionDto dto,
                                                            @PathVariable int id){
        return new ResponseEntity<>(service.upDateSectionDetails(dto, id), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity< String > deleteSectionDetails(@PathVariable int id){
        service.deleteSchoolDetails(id);
        return new ResponseEntity<>("Section Details Deleted Successfully...", HttpStatus.OK);
    }
}
