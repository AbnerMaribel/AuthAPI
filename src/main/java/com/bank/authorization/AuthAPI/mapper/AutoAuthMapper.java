package com.bank.authorization.AuthAPI.mapper;

import com.bank.authorization.AuthAPI.dto.AuthDto;
import com.bank.authorization.AuthAPI.entity.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoAuthMapper {
    AutoAuthMapper MAPPER = Mappers.getMapper(AutoAuthMapper.class);

    AuthDto mapToAuthDto(Auth auth);

    Auth mapToAuth(AuthDto authDto);
}
