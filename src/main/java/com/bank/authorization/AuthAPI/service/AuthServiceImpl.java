package com.bank.authorization.AuthAPI.service;

import com.bank.authorization.AuthAPI.entity.Auth;
import com.bank.authorization.AuthAPI.repository.AuthRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private AuthRepository authRepository;

    @Override
    public Auth createAuth(Auth auth) {
        return authRepository.save(auth);
    }

    @Override
    public Auth getUserById(Long id) {
        List<Auth> auths = authRepository.findAll();
        Auth auth = new Auth();
        for (Auth el : auths) {
            if (id == el.getProfile_id()) {
                auth = el;
                break;
            }
        }
        return auth;
    } //TODO Optional

    @Override
    public List<Auth> getAllRoles() {
        return authRepository.findAll();
    }

    @Override
    public Auth updateAuth(Auth auth) {
        List<Auth> auths = authRepository.findAll();
        Auth updateAuth = new Auth();
        for (Auth el : auths) {
            if (el.getProfile_id() == auth.getProfile_id()) {
                el.setRole(auth.getRole());
                el.setPassword(auth.getPassword());
                updateAuth = authRepository.save(el);
                break;
            }
        }
        return updateAuth;
    }

    @Override
    public void deleteAuth(Long id) {
        List<Auth> auths = authRepository.findAll();
        for (Auth el : auths) {
            if (el.getProfile_id() == id) {
                authRepository.delete(el);
                break;
            }
        }
    }
}
