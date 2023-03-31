package com.example.scoperetail.service;

import com.example.scoperetail.dto.QuikpakDto;
import com.example.scoperetail.entity.Quikpak;
import com.example.scoperetail.mapper.ModelMapper;
import com.example.scoperetail.repository.QuikpakRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuikpakService {

    @Autowired
    QuikpakRepo quikpakRepo;

    @Autowired
    ModelMapper mapper;

    public Optional<Quikpak> getData(Long id) {
        return quikpakRepo.findById(id);
    }

    public Quikpak insertData(QuikpakDto quikpakDto) {
        return quikpakRepo.save(mapper.dtoToEntity(quikpakDto));
    }



//    public String insertData(QuikpakDto quikpakDto) {
//         quikpakRepo.save(quikpakDto);
//         return "Data inserted successfully";
//    }

}
