package in.cerpsoft.app.service;

import in.cerpsoft.app.model.SectionDto;

import java.util.List;

public interface SectionService {

     SectionDto saveSectionDetails(SectionDto dto);

     List<SectionDto> getAllSectionList();

     SectionDto getSectionById(int id);

     SectionDto upDateSectionDetails(SectionDto dto, int id);

     void deleteSchoolDetails(int id);
}
