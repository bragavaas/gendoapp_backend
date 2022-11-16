package com.vasco.gendo.Cliente.ClienteAPI.endpoints.create;

import com.vasco.gendo.Cliente.Cliente;
import com.vasco.gendo.Cliente.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CreateClienteService {
    @Autowired
    ClienteRepository repository;
    public Cliente createNewCliente(Cliente cliente) {
        return repository.save(cliente);
    }
}
