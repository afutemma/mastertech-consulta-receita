package com.mastertech.receita.service;

import com.mastertech.receita.client.ReceitaClient;
import com.mastertech.receita.dto.EmpresaDTO;
import com.mastertech.receita.producer.EmpresaProducer;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    ReceitaClient receitaClient;
    @Autowired
    EmpresaProducer producer;

    public EmpresaDTO verificaCNPJ(String cnpj){
        EmpresaDTO empresa = receitaClient.getByCNPJ(cnpj);

        if(verificaCapital(empresa.getCapital())){
            producer.enviarAoKafka(empresa);
        }

        return empresa;
    }

    public boolean verificaCapital(double capital){
        if(capital >= 1000000){
            return true;
        }
        return false;
    }

}
