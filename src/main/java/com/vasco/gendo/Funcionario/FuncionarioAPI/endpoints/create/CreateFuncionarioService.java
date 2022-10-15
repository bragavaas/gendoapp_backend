package com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.create;

import com.vasco.gendo.Funcionario.Funcionario;
import com.vasco.gendo.Funcionario.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CreateFuncionarioService {
    @Autowired
    FuncionarioRepository repository;
    public Funcionario createNewFuncionario(Funcionario user) {
        return repository.save(user);
    }
}
