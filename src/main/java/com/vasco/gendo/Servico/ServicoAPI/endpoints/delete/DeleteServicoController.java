package com.vasco.gendo.Servico.ServicoAPI.endpoints.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/servico/{id}")
public class DeleteServicoController {
    @Autowired
    DeleteServicoService service;
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)

    public void
    deleteService_whenDeleteServico(@PathVariable Long id)
    {
        service.deleteServico(id);
    }
}
