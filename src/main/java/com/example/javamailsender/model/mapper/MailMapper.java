package com.example.javamailsender.model.mapper;

import com.example.javamailsender.dao.entity.MailEntity;
import com.example.javamailsender.model.MailDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MailMapper {
    MailMapper INSTANCE = Mappers.getMapper(MailMapper.class);
    MailDto buildEntityToDto(MailEntity mailEntity);

}
