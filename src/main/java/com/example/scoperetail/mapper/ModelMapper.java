package com.example.scoperetail.mapper;

import com.example.scoperetail.dto.QuikpakDto;
import com.example.scoperetail.entity.Quikpak;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


    @Mapper(componentModel = "spring")
    public interface ModelMapper {

    @Mapping(source = "empName",target = "name")
    Quikpak dtoToEntity(QuikpakDto quikpakDto);
}
