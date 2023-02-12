package com.bank.authorization.AuthAPI.service;


import com.bank.authorization.AuthAPI.entity.Auth;

import java.util.List;

public interface AuthService {
    Auth createAuth(Auth auth);

    Auth getUserById(Long id);

    List<Auth> getAllRoles();

    Auth updateAuth(Auth auth);

    void deleteAuth(Long id);
}
