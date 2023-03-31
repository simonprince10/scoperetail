package com.example.scoperetail.mapper;

import com.example.scoperetail.dto.QuikpakDto;
import com.example.scoperetail.entity.Quikpak;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-31T09:41:25+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class ModelMapperImpl implements ModelMapper {

    @Override
    public Quikpak dtoToEntity(QuikpakDto quikpakDto) {
        if ( quikpakDto == null ) {
            return null;
        }

        Quikpak quikpak = new Quikpak();

        quikpak.setName( quikpakDto.getEmpName() );
        quikpak.setId( quikpakDto.getId() );
        quikpak.setDepartment( quikpakDto.getDepartment() );
        quikpak.setDescription( quikpakDto.getDescription() );
        quikpak.setPrice( quikpakDto.getPrice() );

        return quikpak;
    }
}
