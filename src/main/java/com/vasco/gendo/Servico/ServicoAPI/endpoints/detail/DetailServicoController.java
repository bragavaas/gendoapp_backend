package com.vasco.gendo.Servico.ServicoAPI.endpoints.detail;

import com.vasco.gendo.Servico.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/servicos/{id}")
public class DetailServicoController {
    @Autowired
    DetailServicoService service;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)

    public ResponseEntity<Optional<Servico>>
    listServico_whenGetServico(@PathVariable Long id)
    {
        return ResponseEntity.ok().body(service.listService(id));

    }

}
