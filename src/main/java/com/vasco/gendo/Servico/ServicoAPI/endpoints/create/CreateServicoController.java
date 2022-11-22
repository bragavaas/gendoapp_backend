package com.vasco.gendo.Servico.ServicoAPI.endpoints.create;

import com.vasco.gendo.Servico.Servico;
import com.vasco.gendo.Servico.ServicoAPI.endpoints.create.CreateServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/servicos")
public class CreateServicoController {
    @Autowired
    CreateServicoService service;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    public ResponseEntity<Servico>
    createNewServico_whenPostServico(@RequestBody Servico servico){
        Servico createdService = service.createNewServico(servico);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdService.getId())
                .toUri();
        return ResponseEntity.created(uri).body(createdService);

    }
}
