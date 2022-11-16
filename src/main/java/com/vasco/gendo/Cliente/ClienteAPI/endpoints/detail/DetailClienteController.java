package com.vasco.gendo.Cliente.ClienteAPI.endpoints.detail;

import com.vasco.gendo.Cliente.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/clientes/{id}")
public class DetailClienteController {
    @Autowired
    DetailClienteService service;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)

    public ResponseEntity<Optional<Cliente>>
    listUser_whenGetUser(@PathVariable Long id)
    {
        return ResponseEntity.ok().body(service.listCliente(id));

    }

}
