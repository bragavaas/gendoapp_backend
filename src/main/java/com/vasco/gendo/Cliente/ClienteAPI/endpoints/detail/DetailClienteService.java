package com.vasco.gendo.Cliente.ClienteAPI.endpoints.detail;

import com.vasco.gendo.Cliente.Cliente;
import com.vasco.gendo.Cliente.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DetailClienteService {
    @Autowired
    ClienteRepository repository;

    public Optional<Cliente> listCliente(Long id) {
        Optional<Cliente> user = repository.findById(id);

        if(!user.isPresent())
        {
            throw new ClienteNotFoundException(id);
        }
        else
        {
            return repository.findById(id);
        }
    }
}
