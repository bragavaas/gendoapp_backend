package com.vasco.gendo.Servico.ServicoAPI.endpoints.detail;

import com.vasco.gendo.Servico.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/servico/{id}")
public class DetailServicoController {
    @Autowired
    DetailServicoService service;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)

    public ResponseEntity<Optional<Servico>>
    listUser_whenGetUser(@PathVariable Long id)
    {
        return ResponseEntity.ok().body(service.listService(id));

    }

}
