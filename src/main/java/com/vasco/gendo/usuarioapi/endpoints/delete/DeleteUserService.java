package com.vasco.gendo.usuarioapi.endpoints.delete;

import com.vasco.gendo.Usuario.User;
import com.vasco.gendo.Usuario.UserRepository;
import com.vasco.gendo.usuarioapi.endpoints.detail.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteUserService {
@Autowired
    UserRepository repository;
public void deleteUser(long id){
    Optional<User> userOptional = repository.findById(id);

    if( !userOptional.isPresent()){
        throw new UserNotFoundException(id);
    }
    else
    {
        repository.deleteById(id);
    }
}
}
