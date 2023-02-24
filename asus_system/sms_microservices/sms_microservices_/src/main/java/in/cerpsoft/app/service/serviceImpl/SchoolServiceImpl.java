package in.cerpsoft.app.service.serviceImpl;

import in.cerpsoft.app.dto.SchoolDto;
import in.cerpsoft.app.repository.SchoolRepository;
import in.cerpsoft.app.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public SchoolDto saveSchoolDetails(SchoolDto schoolDto) {
        return schoolRepository.save(schoolDto);
    }
}
