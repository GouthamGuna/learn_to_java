package in.cerpsoft.app.controller;

import in.cerpsoft.app.model.SpecializationDto;
import in.cerpsoft.app.service.SpecializationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specialization")
public class SpecializationController {
    @Autowired
    private SpecializationService service;

    public SpecializationController(SpecializationService service) {
        this.service = service;
    }
    @PostMapping("/save")
    public ResponseEntity< SpecializationDto > saveSpecializationDetails(@RequestBody @Valid SpecializationDto dto){
        return new ResponseEntity<>(service.saveSpecializationDetails(dto), HttpStatus.CREATED);
    }
    @GetMapping("/fetchAll")
    public ResponseEntity< List< SpecializationDto > > getAllSpecializationList(){
        return ResponseEntity.ok(service.getAllSpecializationList());
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity< SpecializationDto > getSpecializationById(@PathVariable int id){
        return new ResponseEntity<>(service.getSpecializationById(id), HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity< SpecializationDto > upDateSpecializationDetails(@RequestBody SpecializationDto dto,
                                                                           @PathVariable int id){
        return new ResponseEntity<>(service.upDateSpecializationDetails(dto, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity< String > deleteSpecializationDetails(@PathVariable int id){
        service.deleteSpecializationDetails(id);
        return new ResponseEntity<>("Specialization Details Deleted Successfully...", HttpStatus.OK);
    }
}
