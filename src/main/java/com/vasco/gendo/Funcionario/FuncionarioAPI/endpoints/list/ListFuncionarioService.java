package com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.list;

import com.vasco.gendo.Funcionario.Funcionario;
import com.vasco.gendo.Funcionario.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListFuncionarioService {
    @Autowired
    FuncionarioRepository repository;
    public List<Funcionario> listAllFuncionarios(){
        return repository.findAll();
    }
}
