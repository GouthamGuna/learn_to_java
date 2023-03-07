package in.cerpsoft.app.service;

import in.cerpsoft.app.dto.SchoolDto;

import java.util.List;

public interface SchoolService {

     SchoolDto saveSchoolDetails(SchoolDto schoolDto);

     List<SchoolDto> schoolDetailsList();

     SchoolDto getSchoolById(int id);
}
