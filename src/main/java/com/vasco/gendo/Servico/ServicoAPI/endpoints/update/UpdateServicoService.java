package com.vasco.gendo.Servico.ServicoAPI.endpoints.update;

import com.vasco.gendo.Servico.Servico;
import com.vasco.gendo.Servico.ServicoRepository;
import com.vasco.gendo.Servico.ServicoAPI.endpoints.detail.ServicoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateServicoService {
    @Autowired
    ServicoRepository repository;
    public Servico updateServico(long id, Servico servico)
    {
        Optional<Servico> ServicoOptional = repository.findById(id);
        if(ServicoOptional.isEmpty())
        {
            throw new ServicoNotFoundException(id);
        }
        else
        {
            repository.findById(id);
            return repository.save(servico);
        }
    }
}
