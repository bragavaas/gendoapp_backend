package com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionarios/{id}")
public class DeleteFuncionarioController {
    @Autowired
    DeleteFuncionarioService service;
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)

    public void
    deleteFuncionario_whenFuncionarioPut(@PathVariable Long id)
    {
        service.deleteUser(id);
    }
}
