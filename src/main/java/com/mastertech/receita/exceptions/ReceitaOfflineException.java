package com.mastertech.receita.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_GATEWAY, reason = "O sistema de CNPJ da Receita se encontra offline")
public class ReceitaOfflineException extends RuntimeException {
}
