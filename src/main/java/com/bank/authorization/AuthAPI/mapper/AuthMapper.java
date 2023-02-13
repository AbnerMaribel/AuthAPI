package com.bank.authorization.AuthAPI.mapper;

import com.bank.authorization.AuthAPI.dto.AuthDto;
import com.bank.authorization.AuthAPI.entity.Auth;

public class AuthMapper {
    public static AuthDto mapToAuthDto(Auth auth) {
        return new AuthDto(
                auth.getId(),
                auth.getRole(),
                auth.getProfile_id()
        );
    }

}
