package com.bank.authorization.AuthAPI.service;


import com.bank.authorization.AuthAPI.dto.AuthDto;
import com.bank.authorization.AuthAPI.entity.Auth;

import java.util.List;

public interface AuthService {
    AuthDto createAuth(Auth auth);

    AuthDto getUserById(Long id);

    List<AuthDto> getAllRoles();

    AuthDto updateAuth(AuthDto auth);

    void deleteAuth(Long id);
}
