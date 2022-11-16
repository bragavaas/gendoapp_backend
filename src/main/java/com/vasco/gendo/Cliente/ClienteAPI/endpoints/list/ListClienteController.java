package com.vasco.gendo.Cliente.ClienteAPI.endpoints.list;

import com.vasco.gendo.Cliente.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ListClienteController {
    @Autowired
    ListClienteService service;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Cliente>>
    listAllClientes_whenGetClientes(){
        return ResponseEntity.ok().body(service.listAllClientes());
    }
}
