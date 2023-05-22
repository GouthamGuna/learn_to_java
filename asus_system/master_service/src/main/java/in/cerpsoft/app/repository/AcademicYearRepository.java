package in.cerpsoft.app.repository;

import in.cerpsoft.app.model.AcademicYearDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicYearRepository extends JpaRepository< AcademicYearDto, Integer > {

    AcademicYearDto findByAcademicYear(String academicYear);
}
