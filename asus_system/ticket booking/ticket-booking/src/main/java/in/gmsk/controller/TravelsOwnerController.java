package in.gmsk.controller;

import in.gmsk.model.RegistrationTravelOwner;
import in.gmsk.service.RegTravelOwnerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/travels/owner")
public class TravelsOwnerController {

    private Logger logger = LoggerFactory.getLogger(TravelsOwnerController.class);

    private RegTravelOwnerService service;

    public TravelsOwnerController(RegTravelOwnerService service){
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<RegistrationTravelOwner> saveTravelsOwners(
            @RequestBody RegistrationTravelOwner travelOwner){
        logger.info("save the travels owner details {}",travelOwner);
        return new ResponseEntity<>(service.saveTravelsOwnerDetails(travelOwner), HttpStatus.CREATED);
    }
}
