package in.cerpsoft.app.service.serviceImpl;

import in.cerpsoft.app.model.SchoolDto;
import in.cerpsoft.app.exception.ResourceNotFoundException;
import in.cerpsoft.app.repository.SchoolRepository;
import in.cerpsoft.app.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List< SchoolDto > getAllSchoolList() {
        return schoolRepository.findAll();
    }

    @Override
    public SchoolDto getSchoolById(int id) {
        return schoolRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("School", "Id", id));
    }

    @Override
    public SchoolDto upDateSchoolDetails(SchoolDto schoolDto, int id) {
        SchoolDto exitingSchool = schoolRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("School", "Id", id));

        exitingSchool.setAddress(schoolDto.getAddress());
        exitingSchool.setSchoolName(schoolDto.getSchoolName());
        exitingSchool.setSchoolAffiliationNo(schoolDto.getSchoolAffiliationNo());
        exitingSchool.setMobileNo(schoolDto.getMobileNo());
        exitingSchool.setLandLineNo(schoolDto.getLandLineNo());
        exitingSchool.setCountry(schoolDto.getCountry());
        exitingSchool.setState(schoolDto.getState());
        exitingSchool.setCity(schoolDto.getCity());
        exitingSchool.setPinCode(schoolDto.getPinCode());
        exitingSchool.setSchoolLogo(schoolDto.getSchoolLogo());
        exitingSchool.setContactPerson(schoolDto.getContactPerson());
        exitingSchool.setWebsite(schoolDto.getWebsite());
        schoolDto.setEmailId(schoolDto.getEmailId());
        schoolDto.setPersonalEmailId(schoolDto.getPersonalEmailId());

        schoolRepository.save(exitingSchool);

        return exitingSchool;
    }

    @Override
    public void deleteSchoolDetails(int id) {
         schoolRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("School", "Id", id));
        schoolRepository.deleteById(id);
    }
}
