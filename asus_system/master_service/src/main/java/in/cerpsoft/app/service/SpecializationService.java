package in.cerpsoft.app.service;

import in.cerpsoft.app.model.SpecializationDto;

import java.util.List;

public interface SpecializationService {

    SpecializationDto saveSpecializationDetails(SpecializationDto dto);

    List<SpecializationDto> getAllSpecializationList();

    SpecializationDto getSpecializationById(int id);

    SpecializationDto upDateSpecializationDetails(SpecializationDto dto, int id);

    void deleteSpecializationDetails(int id);
}
