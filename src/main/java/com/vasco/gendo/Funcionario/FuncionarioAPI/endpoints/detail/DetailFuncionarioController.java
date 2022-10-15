package com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.detail;

import com.vasco.gendo.Funcionario.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/funcionarios/{id}")
public class DetailFuncionarioController {
    @Autowired
    DetailFuncionarioService service;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)

    public ResponseEntity<Optional<Funcionario>>
    listUser_whenGetUser(@PathVariable Long id)
    {
        return ResponseEntity.ok().body(service.listFuncionario(id));

    }

}
