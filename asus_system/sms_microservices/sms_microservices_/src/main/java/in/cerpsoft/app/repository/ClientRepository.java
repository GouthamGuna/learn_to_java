package in.cerpsoft.app.repository;

import in.cerpsoft.app.dto.ClientDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository < ClientDto, Integer >{
}
