package in.cerpsoft.app.service;

import in.cerpsoft.app.model.BranchDto;
import in.cerpsoft.app.repository.BranchRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BranchServiceTest {
    @Autowired
    private BranchRepository branchRepository;

    @Test
    void findByBranchNameContaining() {

        String input = "salem";
        BranchDto byBranchName = branchRepository.findByBranchName(input);

        System.out.println("byBranchName = " + byBranchName);
    }
}