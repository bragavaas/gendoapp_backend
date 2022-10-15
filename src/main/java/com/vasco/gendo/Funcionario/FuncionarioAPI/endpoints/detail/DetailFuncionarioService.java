package com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.detail;

import com.vasco.gendo.Funcionario.Funcionario;
import com.vasco.gendo.Funcionario.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Optional;

@Service
public class DetailFuncionarioService {
    @Autowired
    FuncionarioRepository repository;

    public Optional<Funcionario> listFuncionario(Long id) {
        Optional<Funcionario> funcionario = repository.findById(id);

        if(!funcionario.isPresent())
        {
            throw new FuncionarioNotFoundException(id);
        }
        else
        {
            return repository.findById(id);
        }
    }
}
