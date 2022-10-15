package com.vasco.gendo.Servico.ServicoAPI.endpoints.detail;

public class ServicoNotFoundException extends RuntimeException{
    public ServicoNotFoundException(Long id){
        super("O Serviço com ID: " + id + " não pôde ser localizado.");
    }
}
