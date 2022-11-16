package com.vasco.gendo.Cliente.ClienteAPI.endpoints.update;

import com.vasco.gendo.Cliente.Cliente;
import com.vasco.gendo.Cliente.ClienteRepository;
import com.vasco.gendo.Cliente.ClienteAPI.endpoints.detail.ClienteNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateClienteService {
    @Autowired
    ClienteRepository repository;
    public Cliente updateCliente(long id, Cliente cliente)
    {
        Optional<Cliente> clienteOptional = repository.findById(id);
        if(clienteOptional.isEmpty())
        {
            throw new ClienteNotFoundException(id);
        }
        else
        {
            repository.findById(id);
            return repository.save(cliente);
        }
    }
}
