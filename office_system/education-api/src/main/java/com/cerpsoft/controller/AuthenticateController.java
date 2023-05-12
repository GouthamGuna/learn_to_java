package com.cerpsoft.controller;

import com.cerpsoft.dto.AuthResponseEntity;
import com.cerpsoft.dto.ErrorResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cerpsoft.dto.AuthRequest;
import com.cerpsoft.service.serviceImpl.AuthenticateServiceImpl;

@RestController
@RequestMapping("/api")
public class AuthenticateController {

    @Autowired
    private AuthenticateServiceImpl serviceImpl;

    @PostMapping("/authenticate")
    public ResponseEntity<?> AuthenticateUser(@RequestBody AuthRequest authRequest) {

        if (authRequest.getUsername().isEmpty() && authRequest.getUsername().isBlank()) {
            return new ResponseEntity<>(new ErrorResponseEntity("username can't be empty"), HttpStatus.CONFLICT);
        } else if (authRequest.getPassword().isEmpty() && authRequest.getPassword().isBlank()) {
            return new ResponseEntity<>(new ErrorResponseEntity("password can't be empty"), HttpStatus.CONFLICT);
        } else {
            String output = serviceImpl.authenticateUser(authRequest);
            return new ResponseEntity<>(new AuthResponseEntity(output), HttpStatus.OK);
        }
    }

    @GetMapping("/home")
    public String sayHello() {
        return "Hello World!";
    }

}
