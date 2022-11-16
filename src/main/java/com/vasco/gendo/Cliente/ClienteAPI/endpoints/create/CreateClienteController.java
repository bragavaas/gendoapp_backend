package com.vasco.gendo.Cliente.ClienteAPI.endpoints.create;

import com.vasco.gendo.Cliente.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/cliente")
public class CreateClienteController {
    @Autowired
    CreateClienteService service;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    public ResponseEntity<Cliente>
    createNewCliente_whenPostCliente(@RequestBody Cliente cliente){
        Cliente createdCliente = service.createNewCliente(cliente);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdCliente.getId())
                .toUri();
        return ResponseEntity.created(uri).body(createdCliente);

    }
}
