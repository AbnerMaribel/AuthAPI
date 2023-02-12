package com.bank.authorization.AuthAPI.repository;

import com.bank.authorization.AuthAPI.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth, Long> {
}
