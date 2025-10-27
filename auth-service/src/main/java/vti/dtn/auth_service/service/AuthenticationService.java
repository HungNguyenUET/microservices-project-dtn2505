package vti.dtn.auth_service.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vti.dtn.auth_service.dto.request.LoginRequest;
import vti.dtn.auth_service.dto.response.LoginResponse;
import vti.dtn.auth_service.dto.response.VerifyTokenResponse;
import vti.dtn.auth_service.repo.UserRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;

    public LoginResponse login(LoginRequest loginRequest) {
        //TODO: Implement login logic
        return null;
    }

    public LoginResponse refreshToken(String authHeader) {
        //TODO: Implement refresh token logic
        return null;
    }

    public VerifyTokenResponse verifyToken(String authHeader) {
        //TODO: Implement verify token logic
        return null;
    }

}
