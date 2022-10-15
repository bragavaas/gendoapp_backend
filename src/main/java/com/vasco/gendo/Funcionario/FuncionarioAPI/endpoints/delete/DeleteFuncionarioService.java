package com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.delete;

import com.vasco.gendo.Funcionario.Funcionario;
import com.vasco.gendo.Funcionario.FuncionarioRepository;
import com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.detail.FuncionarioNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteFuncionarioService {
    @Autowired
    FuncionarioRepository repository;
    public void deleteUser(long id){
        Optional<Funcionario> funcionarioOptional = repository.findById(id);

        if( !funcionarioOptional.isPresent()){
            throw new FuncionarioNotFoundException(id);
        }
        else
        {
            repository.deleteById(id);
        }
    }
}
