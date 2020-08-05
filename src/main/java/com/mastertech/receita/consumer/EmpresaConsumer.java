package com.mastertech.receita.consumer;

import com.mastertech.cadastropj.model.Empresa;
import com.mastertech.receita.producer.EmpresaProducer;
import com.mastertech.receita.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmpresaConsumer {

    @Autowired
    EmpresaService service;

    @KafkaListener(topics = "spec3-amanda-futemma-2", groupId = "shirley-mariel-bernadete")
    public void receber(@Payload Empresa empresa) {
        System.out.println("Consumer recebeu de spec3-amanda-futemma-2");
        service.verificaCNPJ(empresa.getCnpj());
    }
}
