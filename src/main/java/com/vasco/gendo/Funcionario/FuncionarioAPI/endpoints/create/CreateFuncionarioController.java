package com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.create;

import com.vasco.gendo.Funcionario.Funcionario;
import com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.create.CreateFuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/funcionarios")
public class CreateFuncionarioController {
    @Autowired
    CreateFuncionarioService service;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    public ResponseEntity<Funcionario>
    createNewUser_whenPostUser(@RequestBody Funcionario funcionario){
        Funcionario createdFuncionario = service.createNewFuncionario(funcionario);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdFuncionario.getId())
                .toUri();
        return ResponseEntity.created(uri).body(createdFuncionario);

    }
}
