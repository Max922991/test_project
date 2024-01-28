package com.example.test_project.service;


import com.example.test_project.web.dto.auth.JwtRequest;
import com.example.test_project.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}
