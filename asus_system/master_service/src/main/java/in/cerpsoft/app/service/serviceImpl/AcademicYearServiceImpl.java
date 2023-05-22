package in.cerpsoft.app.service.serviceImpl;

import in.cerpsoft.app.model.AcademicYearDto;
import in.cerpsoft.app.exception.ResourceNotFoundException;
import in.cerpsoft.app.repository.AcademicYearRepository;
import in.cerpsoft.app.service.AcademicYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicYearServiceImpl implements AcademicYearService {
    @Autowired
    private AcademicYearRepository repository;

    public AcademicYearServiceImpl(AcademicYearRepository repository){
        this.repository = repository;
    }

    @Override
    public AcademicYearDto saveAcademicYearDetails(AcademicYearDto yearDto) {
      //  if(repository.findByAcademicYear(yearDto.getAcademicYear()) !=null) throw new ResourceAlreadyExists("AcademicYear", "Year", yearDto.getAcademicYear());
        return repository.save(yearDto);
    }

    @Override
    public List< AcademicYearDto > getAllAcademicYearList() {
        return repository.findAll();
    }

    @Override
    public AcademicYearDto getAcademicYearById(int id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("AcademicYear","Id",id));
    }

    @Override
    public AcademicYearDto upDateAcademicYearDetails(AcademicYearDto yearDto, int id) {
        AcademicYearDto exitingAcademicYear = repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("AcademicYear","Id",id));

        exitingAcademicYear.setStartDate(yearDto.getStartDate());
        exitingAcademicYear.setEndDate(yearDto.getEndDate());
        exitingAcademicYear.setAcademicYear(yearDto.getAcademicYear());

        repository.save(exitingAcademicYear);

        return exitingAcademicYear;
    }

    @Override
    public void deleteAcademicYear(int id) {
        repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("AcademicYear","Id",id));
        repository.deleteById(id);
    }
}
