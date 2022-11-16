package com.vasco.gendo.Cliente.ClienteAPI.endpoints.update;

import com.vasco.gendo.Cliente.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes/{id}")
public class UpdateClienteController {
    @Autowired
    UpdateClienteService service;
    @PutMapping
    @ResponseStatus(HttpStatus.OK)

    public ResponseEntity<Cliente> updateCliente_whenPutCliente(@PathVariable long id, @RequestBody Cliente cliente) {
        return ResponseEntity.ok().body(service.updateCliente(id, cliente));
    }
}
