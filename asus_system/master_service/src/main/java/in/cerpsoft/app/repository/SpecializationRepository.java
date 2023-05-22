package in.cerpsoft.app.repository;

import in.cerpsoft.app.model.SpecializationDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecializationRepository extends JpaRepository< SpecializationDto, Integer > {
}
