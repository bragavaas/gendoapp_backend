package com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.update;

import com.vasco.gendo.Funcionario.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionarios/{id}")
public class UpdateUserController {
    @Autowired
    UpdateFuncionarioService service;
    @PutMapping
    @ResponseStatus(HttpStatus.OK)

    public ResponseEntity<Funcionario> updateUser_whenPutUser(@PathVariable long id, @RequestBody Funcionario funcionario) {
        return ResponseEntity.ok().body(service.updateFuncionario(id, funcionario));
    }
}
