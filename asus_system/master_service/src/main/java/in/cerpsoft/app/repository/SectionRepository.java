package in.cerpsoft.app.repository;

import in.cerpsoft.app.model.SectionDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository< SectionDto, Integer > {
}
