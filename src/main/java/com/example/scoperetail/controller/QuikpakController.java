package com.example.scoperetail.controller;

import com.example.scoperetail.dto.QuikpakDto;
import com.example.scoperetail.entity.Quikpak;
import com.example.scoperetail.service.QuikpakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class QuikpakController {

   @Autowired
    QuikpakService quikpakService;

   @GetMapping("/getData")
    public Optional<Quikpak> getData(@RequestParam Long id){
       return quikpakService.getData(id);
   }

   @PostMapping("/insertData")
    public Quikpak insertData(@RequestBody QuikpakDto quikpakDto){
       return quikpakService.insertData(quikpakDto);
   }


}
