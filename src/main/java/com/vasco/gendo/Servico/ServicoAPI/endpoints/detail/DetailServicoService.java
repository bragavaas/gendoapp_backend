package com.vasco.gendo.Servico.ServicoAPI.endpoints.detail;

import com.vasco.gendo.Servico.Servico;
import com.vasco.gendo.Servico.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Optional;

@Service
public class DetailServicoService {
    @Autowired
    ServicoRepository repository;

    public Optional<Servico> listService(Long id) {
        Optional<Servico> servico = repository.findById(id);

        if(!servico.isPresent())
        {
            throw new ServicoNotFoundException(id);
        }
        else
        {
            return repository.findById(id);
        }
    }
}
