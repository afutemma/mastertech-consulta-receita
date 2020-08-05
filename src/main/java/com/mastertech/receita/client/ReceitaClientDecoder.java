package com.mastertech.receita.client;

import com.mastertech.receita.exceptions.ReceitaOfflineException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class ReceitaClientDecoder implements ErrorDecoder {

    private ErrorDecoder errorDecoder = new ErrorDecoder.Default();

    @Override
    public Exception decode(String s, Response response) {
        if (response.status() == 400) {
            throw new ReceitaOfflineException();
        } else {
            return errorDecoder.decode(s, response);
        }
    }
}
