package com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.update;

import com.vasco.gendo.Cliente.Cliente;
import com.vasco.gendo.Funcionario.Funcionario;
import com.vasco.gendo.Funcionario.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/funcionarios/{id}")
public class UpdateFuncionarioController {
    @Autowired
    FuncionarioRepository repository;
    @PutMapping
    @ResponseStatus(HttpStatus.OK)

    public ResponseEntity<Funcionario> updateFuncionario_whenPutFuncionario(@PathVariable long id, @RequestBody Funcionario funcionario) {
        return repository.findById(id).map(recordFound -> {
                    recordFound.setId(id);
                    recordFound.setNome(funcionario.getNome());
                    recordFound.setCelular(funcionario.getCelular());
                    recordFound.setEmail(funcionario.getEmail());
                    recordFound.setCpf(funcionario.getCpf());
                    recordFound.setExpediente(funcionario.getExpediente());
                    recordFound.setObservacoes(funcionario.getObservacoes());
                    Funcionario updated = repository.save(recordFound);
                    return ResponseEntity.ok().body(recordFound);
                })
                .orElse(ResponseEntity.notFound().build());
    }
}

