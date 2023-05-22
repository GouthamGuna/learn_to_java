package in.cerpsoft.app.controller;

import in.cerpsoft.app.model.BranchDto;
import in.cerpsoft.app.service.BranchService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branch")
public class BranchController {
    @Autowired
    private BranchService branchService;

    public BranchController(BranchService branchService){
        this.branchService = branchService;
    }
    @PostMapping("/save")
    public ResponseEntity<BranchDto> saveBranchDetails(@RequestBody @Valid  BranchDto branchDto){
        return new ResponseEntity<>(branchService.saveBranchDetails(branchDto), HttpStatus.CREATED);
    }
    @GetMapping("/fetchAll")
    public ResponseEntity< List<BranchDto> > getAllBranchList(){
        return ResponseEntity.ok(branchService.getAllBranchList());
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<BranchDto> getBranchById(@PathVariable int id){
        return new ResponseEntity<>(branchService.getBranchById(id), HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<BranchDto> upDateSchoolDetails(@RequestBody @Valid BranchDto branchDto,
                                                         @PathVariable int id){
        return new ResponseEntity<>(branchService.upDateBranchDetails(branchDto,id),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBranchDetails(@PathVariable int id){
        branchService.deleteSchoolDetails(id);
        return new ResponseEntity<>("Branch Details Deleted Successfully...", HttpStatus.OK);
    }
}
