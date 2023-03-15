package in.cerpsoft.app.repository;

import in.cerpsoft.app.dto.BranchDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository< BranchDto, Integer > {
}
