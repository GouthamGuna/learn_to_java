package in.cerpsoft.app.service.serviceImpl;

import in.cerpsoft.app.dto.ClientDto;
import in.cerpsoft.app.repository.ClientRepository;
import in.cerpsoft.app.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientDto saveClientDetails(ClientDto clientDto) {
        return clientRepository.save(clientDto);
    }
}
