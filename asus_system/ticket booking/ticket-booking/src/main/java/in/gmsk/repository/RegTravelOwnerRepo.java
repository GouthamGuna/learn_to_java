package in.gmsk.repository;

import in.gmsk.model.RegistrationTravelOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegTravelOwnerRepo extends JpaRepository<RegistrationTravelOwner, Integer> {
}
