package in.cerpsoft.app.service;

import in.cerpsoft.app.model.SchoolDto;

import java.util.List;

public interface SchoolService {

     SchoolDto saveSchoolDetails(SchoolDto schoolDto);

     List<SchoolDto> getAllSchoolList();

     SchoolDto getSchoolById(int id);

     SchoolDto upDateSchoolDetails(SchoolDto schoolDto, int id);

     void deleteSchoolDetails(int id);
}
