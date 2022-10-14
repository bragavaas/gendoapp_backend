package com.vasco.gendo.Usuario.UsuarioAPI.endpoints.detail;

import com.vasco.gendo.Usuario.User;
import com.vasco.gendo.Usuario.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Optional;

@Service
public class DetailUserService {
    @Autowired
    UserRepository repository;

    public Optional<User> listUser(Long id) {
        Optional<User> user = repository.findById(id);

        if(!user.isPresent())
        {
            throw new UserNotFoundException(id);
        }
        else
        {
            return repository.findById(id);
        }
    }
}
