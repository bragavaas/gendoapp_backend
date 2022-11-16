package com.vasco.gendo.Cliente.ClienteAPI.endpoints.list;

import com.vasco.gendo.Cliente.Cliente;
import com.vasco.gendo.Cliente.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListClienteService {
    @Autowired
    ClienteRepository repository;
    public List<Cliente> listAllClientes(){
        return repository.findAll();
    }
}
