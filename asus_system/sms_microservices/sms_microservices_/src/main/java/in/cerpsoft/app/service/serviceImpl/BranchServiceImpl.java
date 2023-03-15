package in.cerpsoft.app.service.serviceImpl;

import in.cerpsoft.app.dto.BranchDto;
import in.cerpsoft.app.repository.BranchRepository;
import in.cerpsoft.app.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService {
    @Autowired
    private BranchRepository branchRepository;

    public BranchServiceImpl(BranchRepository branchRepository){
        this.branchRepository = branchRepository;
    }

    @Override
    public BranchDto saveBranchDetails(BranchDto branchDto) {
        return branchRepository.save(branchDto);
    }
}
