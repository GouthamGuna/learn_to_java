package in.cerpsoft.app.repository;

import in.cerpsoft.app.model.BranchDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository< BranchDto, Integer > {

    BranchDto findByBranchName(String branchName);
}
