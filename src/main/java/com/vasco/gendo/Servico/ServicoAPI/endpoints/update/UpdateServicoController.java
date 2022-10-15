package com.vasco.gendo.Servico.ServicoAPI.endpoints.update;

import com.vasco.gendo.Servico.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/servico/{id}")
public class UpdateServicoController {
    @Autowired
    UpdateServicoService service;
    @PutMapping
    @ResponseStatus(HttpStatus.OK)

    public ResponseEntity<Servico> updateUser_whenPutUser(@PathVariable long id, @RequestBody Servico servico) {
        return ResponseEntity.ok().body(service.updateServico(id, servico));
    }
}