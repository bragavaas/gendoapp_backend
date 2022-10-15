package com.vasco.gendo.Servico.ServicoAPI.endpoints.detail;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ServicoNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ServicoNotFoundException.class)

    @ResponseStatus(HttpStatus.NOT_FOUND)

    String
    ServicoNotFoundHandler(ServicoNotFoundException ex)
    {
        return ex.getMessage();
    }

}
