package com.vasco.gendo.Usuario.UsuarioAPI.endpoints.update;

import com.vasco.gendo.Usuario.User;
import com.vasco.gendo.Usuario.UserRepository;
import com.vasco.gendo.Usuario.UsuarioAPI.endpoints.detail.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateUserService {
@Autowired
    UserRepository repository;
public User updateUser(long id, User user)
{
    Optional<User> userOptional = repository.findById(id);
    if(userOptional.isEmpty())
    {
        throw new UserNotFoundException(id);
    }
    else
    {
        repository.findById(id);
        return repository.save(user);
    }
}
}
