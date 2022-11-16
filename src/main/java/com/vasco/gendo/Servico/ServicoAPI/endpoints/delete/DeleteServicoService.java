package com.vasco.gendo.Servico.ServicoAPI.endpoints.delete;

import com.vasco.gendo.Servico.Servico;
import com.vasco.gendo.Servico.ServicoRepository;
import com.vasco.gendo.Servico.ServicoAPI.endpoints.detail.ServicoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteServicoService {
    @Autowired
    ServicoRepository repository;
    public void deleteServico(long id){
        Optional<Servico> ServicoOptional = repository.findById(id);

        if( !ServicoOptional.isPresent()){
            throw new ServicoNotFoundException(id);
        }
        else
        {
            repository.deleteById(id);
        }
    }
}
