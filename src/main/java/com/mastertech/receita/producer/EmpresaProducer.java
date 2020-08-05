package com.mastertech.receita.producer;

import com.mastertech.cadastropj.model.Empresa;
import com.mastertech.receita.dto.EmpresaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmpresaProducer {

    @Autowired
    private KafkaTemplate<String, EmpresaDTO> producer;

    public void enviarAoKafka(EmpresaDTO empresa) {
        System.out.println("Producer enviou para spec3-amanda-futemma-3");
        producer.send("spec3-amanda-futemma-3", empresa);
    }
}
