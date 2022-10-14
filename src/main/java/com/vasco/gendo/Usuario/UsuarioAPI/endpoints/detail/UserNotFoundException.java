package com.vasco.gendo.Usuario.UsuarioAPI.endpoints.detail;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("O usuário com ID: " + id + " não pôde ser localizado.");
    }
}
