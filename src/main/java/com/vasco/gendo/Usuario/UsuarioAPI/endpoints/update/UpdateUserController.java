package com.vasco.gendo.Usuario.UsuarioAPI.endpoints.update;

import com.vasco.gendo.Usuario.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/{id}")
public class UpdateUserController {
    @Autowired
    UpdateUserService service;
    @PutMapping
    @ResponseStatus(HttpStatus.OK)

    public ResponseEntity<User> updateUser_whenPutUser(@PathVariable long id, @RequestBody User user) {
        return ResponseEntity.ok().body(service.updateUser(id, user));
    }
}
