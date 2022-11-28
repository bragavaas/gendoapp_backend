package com.vasco.gendo.Cliente.ClienteAPI.endpoints.update;

import com.vasco.gendo.Cliente.Cliente;
import com.vasco.gendo.Cliente.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes/{id}")
public class UpdateClienteController {
    @Autowired
    ClienteRepository repository;
    @PutMapping
    @ResponseStatus(HttpStatus.OK)

    public ResponseEntity<Cliente> updateClient_whenPutClient(@PathVariable long id, @RequestBody Cliente cliente) {
        return repository.findById(id).map(recordFound -> {
            recordFound.setId(id);
            recordFound.setNome(cliente.getNome());
            recordFound.setTelefone(cliente.getTelefone());
            recordFound.setEmail(cliente.getEmail());
            Cliente updated = repository.save(recordFound);
            return ResponseEntity.ok().body(recordFound);
        })
                .orElse(ResponseEntity.notFound().build());
    }
}
