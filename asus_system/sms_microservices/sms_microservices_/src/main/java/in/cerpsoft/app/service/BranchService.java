package in.cerpsoft.app.service;

import in.cerpsoft.app.dto.BranchDto;

import java.util.List;

public interface BranchService {

    BranchDto saveBranchDetails(BranchDto branchDto);

    List<BranchDto> getAllBranchList();

    BranchDto getBranchById(int id);

    BranchDto upDateBranchDetails(BranchDto branchDto, int id);

    void deleteSchoolDetails(int id);
}
