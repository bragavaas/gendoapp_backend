package com.vasco.gendo.Cliente.ClienteAPI.endpoints.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes/{id}")
public class DeleteClienteController {
    @Autowired
    DeleteClienteService service;
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)

    public void
    deleteCliente_whenDeleteCliente(@PathVariable Long id)
    {
        service.deleteCliente(id);
    }
}
