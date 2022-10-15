package com.vasco.gendo.Funcionario.FuncionarioAPI.endpoints.detail;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class FuncionarioNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(FuncionarioNotFoundException.class)

    @ResponseStatus(HttpStatus.NOT_FOUND)

    String
    userNotFoundHandler(FuncionarioNotFoundException ex)
    {
        return ex.getMessage();
    }

}
