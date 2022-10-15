package com.vasco.gendo.Servico.ServicoAPI.endpoints.list;

import com.vasco.gendo.Servico.Servico;
import com.vasco.gendo.Servico.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListServicoService {
    @Autowired
    ServicoRepository repository;
    public List<Servico> listAllServices(){
        return repository.findAll();
    }
}
