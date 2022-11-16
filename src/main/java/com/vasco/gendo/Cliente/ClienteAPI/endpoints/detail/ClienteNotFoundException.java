package com.vasco.gendo.Cliente.ClienteAPI.endpoints.detail;

public class ClienteNotFoundException extends RuntimeException{
    public ClienteNotFoundException(Long id){
        super("O Cliente com ID: " + id + " não pôde ser localizado.");
    }
}
