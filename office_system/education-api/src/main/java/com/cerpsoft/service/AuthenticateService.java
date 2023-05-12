package com.cerpsoft.service;

import com.cerpsoft.dto.AuthRequest;
import com.cerpsoft.dto.AuthResponseEntity;

public interface AuthenticateService {

	String authenticateUser(AuthRequest authRequest);

}
