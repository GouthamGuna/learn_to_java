package in.cerpsoft.app.controller;

import in.cerpsoft.app.dto.BranchDto;
import in.cerpsoft.app.service.BranchService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/branch/api")
public class BranchController {
    @Autowired
    private BranchService branchService;

    public BranchController(BranchService branchService){
        this.branchService = branchService;
    }
    @PostMapping("/save")
    public ResponseEntity<BranchDto> saveBranch(@RequestBody @Valid  BranchDto branchDto){
        return new ResponseEntity<>(branchService.saveBranchDetails(branchDto), HttpStatus.CREATED);
    }
}
