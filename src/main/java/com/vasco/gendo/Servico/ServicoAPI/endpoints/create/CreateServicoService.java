package com.vasco.gendo.Servico.ServicoAPI.endpoints.create;

import com.vasco.gendo.Servico.Servico;
import com.vasco.gendo.Servico.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CreateServicoService {
    @Autowired
    ServicoRepository repository;
    public Servico createNewUser(Servico servico) {
        return repository.save(servico);
    }
}
