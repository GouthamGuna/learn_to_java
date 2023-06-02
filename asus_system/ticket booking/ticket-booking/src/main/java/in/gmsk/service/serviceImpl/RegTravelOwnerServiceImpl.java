package in.gmsk.service.serviceImpl;

import in.gmsk.model.RegistrationTravelOwner;
import in.gmsk.repository.RegTravelOwnerRepo;
import in.gmsk.service.RegTravelOwnerService;
import org.springframework.stereotype.Service;

@Service
public class RegTravelOwnerServiceImpl implements RegTravelOwnerService {

    private RegTravelOwnerRepo repository;

    public RegTravelOwnerServiceImpl(RegTravelOwnerRepo repository){
        this.repository = repository;
    }

    @Override
    public RegistrationTravelOwner saveTravelsOwnerDetails(RegistrationTravelOwner travelOwner) {
        return repository.save(travelOwner);
    }
}
