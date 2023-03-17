package in.cerpsoft.app.controller;

import in.cerpsoft.app.dto.ClientDto;
import in.cerpsoft.app.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/save")
    public ResponseEntity<ClientDto> saveClient(@RequestBody ClientDto clientDto){
        return new ResponseEntity<>(clientService.saveClientDetails(clientDto), HttpStatus.CREATED);
    }
}
