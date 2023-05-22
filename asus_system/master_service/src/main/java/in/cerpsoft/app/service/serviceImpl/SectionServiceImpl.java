package in.cerpsoft.app.service.serviceImpl;

import in.cerpsoft.app.model.SectionDto;
import in.cerpsoft.app.exception.ResourceNotFoundException;
import in.cerpsoft.app.repository.SectionRepository;
import in.cerpsoft.app.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {
    @Autowired
    private SectionRepository repository;
    public SectionServiceImpl(SectionRepository repository){
        this.repository=repository;
    }

    @Override
    public SectionDto saveSectionDetails(SectionDto dto) {
        return repository.save(dto);
    }

    @Override
    public List<SectionDto> getAllSectionList() {
        return repository.findAll();
    }

    @Override
    public SectionDto getSectionById(int id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Section","id",id));
    }

    @Override
    public SectionDto upDateSectionDetails(SectionDto dto, int id) {
        SectionDto exitingSection = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Section","id",id));

        exitingSection.setBranch(dto.getBranch());
        exitingSection.setSectionName(dto.getSectionName());
        exitingSection.setIsActive(dto.getIsActive());


        repository.save(exitingSection);

        return exitingSection;
    }

    @Override
    public void deleteSchoolDetails(int id) {
         repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Section", "id", id));
         repository.deleteById(id);
    }
}
