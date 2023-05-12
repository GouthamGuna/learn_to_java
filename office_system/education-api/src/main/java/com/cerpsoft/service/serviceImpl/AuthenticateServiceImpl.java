package com.cerpsoft.service.serviceImpl;

import com.cerpsoft.config.JDBCConnection;
import com.cerpsoft.dto.AuthResponseEntity;
import com.cerpsoft.dto.ClientDBDetails;
import com.cerpsoft.dto.ErrorResponseEntity;
import com.cerpsoft.model.CustomerDBDetails;
import com.cerpsoft.repository.AuthenticateRepository;
import com.cerpsoft.repository.AuthorizedUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.cerpsoft.dto.AuthRequest;
import com.cerpsoft.service.AuthenticateService;

import java.sql.*;
import java.util.List;
import java.util.Properties;

@Service
public class AuthenticateServiceImpl implements AuthenticateService {

    private static String dbHost = null;
    private static String dbName = null;
    private static String dbUserName = null;
    private static String dbUserSecret = null;
    private AuthenticateRepository repository;
    @Autowired
    private AuthorizedUserRepository authorizedUserRepository;

    public AuthenticateServiceImpl(AuthenticateRepository repository, AuthorizedUserRepository authorizedUserRepositor) {
        this.repository = repository;
        this.authorizedUserRepository = authorizedUserRepository;
    }

    @Override
    public String authenticateUser(AuthRequest authRequest) {

        String domainName = null;
        String userId = null;

        if (authRequest.getUsername() != null && authRequest.getUsername().contains("@")) {
            domainName = authRequest.getUsername().split("@")[1];

            List<CustomerDBDetails> customerDBDetails = repository.findByAppName(domainName);
            authenticateUserNameAndPassword(customerDBDetails);
            loadedClientDataBaseDetails();

            if (dbHost != null && !dbHost.equals("")) {
                userId = authorizedClientDataBase(authRequest.getUsername(), authRequest.getPassword());
            } else {
                userId = "user domain does not exit's";
            }
        } else {
            userId = "Invalid username!";
        }

        return userId;
    }

    private String authorizedClientDataBase(String username, String password) {
        return authorizedUserRepository.authorizationUserNameAndPassword(username, password);
    }

    public static ClientDBDetails loadedClientDataBaseDetails() {

        ClientDBDetails clientDBDetails = new ClientDBDetails();
        clientDBDetails.setDbhost(dbHost);
        clientDBDetails.setDatabase(dbName);
        clientDBDetails.setDbusername(dbUserName);
        clientDBDetails.setDbpassword(dbUserSecret);

        return clientDBDetails;
    }

    private void authenticateUserNameAndPassword(List<CustomerDBDetails> customerDBDetails) {

        for (var split : customerDBDetails) {
            dbHost = split.getDbHost();
            dbName = split.getDbName();
            dbUserName = split.getDbUserName();
            dbUserSecret = split.getDbUserSecret();
        }
    }
}
