package in.cerpsoft.app.service.serviceImpl;

import in.cerpsoft.app.model.BranchDto;
import in.cerpsoft.app.exception.ResourceAlreadyExists;
import in.cerpsoft.app.exception.ResourceNotFoundException;
import in.cerpsoft.app.repository.BranchRepository;
import in.cerpsoft.app.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {
    @Autowired
    private BranchRepository branchRepository;

    public BranchServiceImpl(BranchRepository branchRepository){
        this.branchRepository = branchRepository;
    }

    @Override
    public BranchDto saveBranchDetails(BranchDto branchDto) {

        if(branchRepository.findByBranchName(branchDto.getBranchName()) !=null) throw new ResourceAlreadyExists("Branch", "BranchName", branchDto.getBranchName());
        return branchRepository.save(branchDto);
    }

    @Override
    public List< BranchDto > getAllBranchList() {
        return branchRepository.findAll();
    }

    @Override
    public BranchDto getBranchById(int id) {
        return branchRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Branch"," Id", id));
    }

    @Override
    public BranchDto upDateBranchDetails(BranchDto branchDto, int id) {
        BranchDto exitingBranch = branchRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Branch", "Id", id));

        exitingBranch.setAddress(branchDto.getAddress());
        exitingBranch.setSchoolName(branchDto.getSchoolName());
        exitingBranch.setBranchName(branchDto.getBranchName());
        exitingBranch.setBoardType(branchDto.getBoardType());
        exitingBranch.setAffiliatedTo(branchDto.getAffiliatedTo());
        exitingBranch.setMobileNo(branchDto.getMobileNo());
        exitingBranch.setBranchCode(branchDto.getBranchCode());
        exitingBranch.setCountry(branchDto.getCountry());
        exitingBranch.setState(branchDto.getState());
        exitingBranch.setCity(branchDto.getCity());
        exitingBranch.setPinCode(branchDto.getPinCode());
        exitingBranch.setBranchLogo(branchDto.getBranchLogo());
        exitingBranch.setPrincipalMobile(branchDto.getPrincipalMobile());
        exitingBranch.setWebsite(branchDto.getWebsite());
        exitingBranch.setEmailId(branchDto.getEmailId());
        exitingBranch.setPrincipalEmailId(branchDto.getPrincipalEmailId());

        branchRepository.save(exitingBranch);

        return exitingBranch;
    }

    @Override
    public void deleteSchoolDetails(int id) {
        branchRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Branch", "Id", id));
        branchRepository.deleteById(id);
    }
}
