package com.mastertech.receita.client;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class ReceitaClientConfiguration {

    @Bean
    public ErrorDecoder getErrorDecoder(){
        return new ReceitaClientDecoder();
    }
}
