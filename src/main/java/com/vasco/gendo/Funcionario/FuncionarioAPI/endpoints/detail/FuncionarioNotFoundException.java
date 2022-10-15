package com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.detail;

public class FuncionarioNotFoundException extends RuntimeException{
    public FuncionarioNotFoundException(Long id){
        super("O funcionário com ID: " + id + " não pôde ser localizado.");
    }
}
