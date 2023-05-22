package in.cerpsoft.app.service.serviceImpl;

import in.cerpsoft.app.model.SpecializationDto;
import in.cerpsoft.app.exception.ResourceNotFoundException;
import in.cerpsoft.app.repository.SpecializationRepository;
import in.cerpsoft.app.service.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecializationServiceImpl implements SpecializationService {

    @Autowired
    private SpecializationRepository repository;

    public SpecializationServiceImpl(SpecializationRepository repository) {
        this.repository = repository;
    }

    @Override
    public SpecializationDto saveSpecializationDetails(SpecializationDto dto) {
        return repository.save(dto);
    }

    @Override
    public List< SpecializationDto > getAllSpecializationList() {
        return repository.findAll();
    }

    @Override
    public SpecializationDto getSpecializationById(int id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Specialization", "Id", id));
    }

    @Override
    public SpecializationDto upDateSpecializationDetails(SpecializationDto dto, int id) {
        SpecializationDto exitingSpecialization = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Specialization", "Id", id));

        exitingSpecialization.setBranch(dto.getBranch());
        exitingSpecialization.setSpecializationName(dto.getSpecializationName());
        exitingSpecialization.setRemarks(dto.getRemarks());
        exitingSpecialization.setIsActive(dto.getIsActive());

        repository.save(exitingSpecialization);

        return exitingSpecialization;
    }

    @Override
    public void deleteSpecializationDetails(int id) {
        repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Specialization", "Id", id));
        repository.deleteById(id);
    }
}
