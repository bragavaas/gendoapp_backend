package com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.update;

import com.vasco.gendo.Funcionario.Funcionario;
import com.vasco.gendo.Funcionario.FuncionarioRepository;
import com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.detail.FuncionarioNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateFuncionarioService {
    @Autowired
    FuncionarioRepository repository;
    public Funcionario updateFuncionario(long id, Funcionario funcionario)
    {
        Optional<Funcionario> funcionarioOptional = repository.findById(id);
        if(funcionarioOptional.isEmpty())
        {
            throw new FuncionarioNotFoundException(id);
        }
        else
        {
            repository.findById(id);
            return repository.save(funcionario);
        }
    }
}
