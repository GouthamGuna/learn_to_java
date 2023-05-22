package in.cerpsoft.app.service;

import in.cerpsoft.app.model.AcademicYearDto;

import java.util.List;

public interface AcademicYearService {

    AcademicYearDto saveAcademicYearDetails(AcademicYearDto yearDto);

    List<AcademicYearDto> getAllAcademicYearList();

    AcademicYearDto getAcademicYearById(int id);

    AcademicYearDto upDateAcademicYearDetails(AcademicYearDto yearDto, int id);

    void deleteAcademicYear(int id);
}
