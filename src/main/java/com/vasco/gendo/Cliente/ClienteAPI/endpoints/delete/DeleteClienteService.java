package com.vasco.gendo.Cliente.ClienteAPI.endpoints.delete;

import com.vasco.gendo.Cliente.Cliente;
import com.vasco.gendo.Cliente.ClienteRepository;
import com.vasco.gendo.Cliente.ClienteAPI.endpoints.detail.ClienteNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteClienteService {
@Autowired
    ClienteRepository repository;
public void deleteCliente(long id){
    Optional<Cliente> clienteOptional = repository.findById(id);

    if( !clienteOptional.isPresent()){
        throw new ClienteNotFoundException(id);
    }
    else
    {
        repository.deleteById(id);
    }
}
}
