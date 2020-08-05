package com.mastertech.receita.client;

import com.mastertech.receita.dto.EmpresaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "receita", url = "https://www.receitaws.com.br/")
public interface ReceitaClient {

    @GetMapping("/v1/cnpj/{cnpj}")
    EmpresaDTO getByCNPJ(@PathVariable String cnpj);

}
