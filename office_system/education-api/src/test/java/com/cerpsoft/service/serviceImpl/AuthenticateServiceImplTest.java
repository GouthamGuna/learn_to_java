package com.cerpsoft.service.serviceImpl;

import com.cerpsoft.dto.AuthRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuthenticateServiceImplTest {
    @Autowired
    private AuthenticateServiceImpl service;

    @Test
    void authenticateUser() {

        AuthRequest authRequest = new AuthRequest("admin", "admin");

        //String output = service.authenticateUser(authRequest);

        //System.out.println("output : " + output);
    }
}