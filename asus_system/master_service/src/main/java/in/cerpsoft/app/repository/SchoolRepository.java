package in.cerpsoft.app.repository;

import in.cerpsoft.app.model.SchoolDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository< SchoolDto, Integer > {
}
