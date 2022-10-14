package com.vasco.gendo.Usuario.UsuarioAPI.endpoints.list;

import com.vasco.gendo.Usuario.User;
import com.vasco.gendo.Usuario.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListUserService {
    @Autowired
    UserRepository repository;
    public List<User> listAllUsers(){
        return repository.findAll();
    }
}
