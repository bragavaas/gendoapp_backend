package com.vasco.gendo.Servico.ServicoAPI.endpoints.update;

import com.vasco.gendo.Funcionario.Funcionario;
import com.vasco.gendo.Servico.Servico;
import com.vasco.gendo.Servico.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/servicos/{id}")
public class UpdateServicoController {
    @Autowired
    ServicoRepository repository;
    @PutMapping
    @ResponseStatus(HttpStatus.OK)

    public ResponseEntity<Servico> updateServico_whenPutServico(@PathVariable long id, @RequestBody Servico servico) {
        return repository.findById(id).map(recordFound -> {
                    recordFound.setId(id);
                    recordFound.setNome_do_servico(servico.getNome_do_servico());
                    recordFound.setDescricao(servico.getDescricao());
                    recordFound.setDuracao_do_atendimento(servico.getDuracao_do_atendimento());
                    recordFound.setValor_servico(servico.getValor_servico());
                    recordFound.setComissao(servico.getComissao());
                    Servico updated = repository.save(recordFound);
                    return ResponseEntity.ok().body(recordFound);
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
