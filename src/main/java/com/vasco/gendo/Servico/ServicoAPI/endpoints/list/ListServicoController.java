package com.vasco.gendo.Servico.ServicoAPI.endpoints.list;

import com.vasco.gendo.Servico.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/servicos")
public class ListServicoController {
    @Autowired
    ListServicoService service;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Servico>>
    listAllServicos_whenGetServicos(){
        return ResponseEntity.ok().body(service.listAllServicos());
    }
}
