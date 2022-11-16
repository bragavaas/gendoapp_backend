package com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.list;

import com.vasco.gendo.Funcionario.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class ListFuncionarioController {
    @Autowired
    ListFuncionarioService service;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Funcionario>>
    listAllUsers_whenGetUsers(){
        return ResponseEntity.ok().body(service.listAllFuncionarios());
    }
}
