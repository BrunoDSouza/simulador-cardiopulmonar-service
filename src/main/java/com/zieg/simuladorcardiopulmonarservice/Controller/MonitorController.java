package com.zieg.simuladorcardiopulmonarservice.Controller;

import com.zieg.simuladorcardiopulmonarservice.Model.Classificacao;
import com.zieg.simuladorcardiopulmonarservice.Model.Parametro;
import com.zieg.simuladorcardiopulmonarservice.Repository.ClassificacaoRepository;
import com.zieg.simuladorcardiopulmonarservice.Repository.ParametroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MonitorController {


    @Autowired
    private ClassificacaoRepository classificacaoRepository;

    @Autowired
    private ParametroRepository parametroRepository;

    @MessageMapping("/simulator.action")
    @SendTo("/channel/public")
    public String sendParametros(@Payload String payload){
        List<Classificacao> list = classificacaoRepository.findAll();

        Classificacao classificacao = classificacaoRepository.findByName("Fisiologia Pulmonar");

        Parametro parametro1 = Parametro.builder()
                .name("Rva (cmH2O/l/s)")
                .description("Resitencia nas vias aéreas: É uma propriedade fisica que mede opsição ao " +
                        "fluxo de ar nas zonas condutoras da árvore brônquica")
                .vl_max(6)
                .vl_min(2)
                .vl_default(4)
                .classificacao(classificacao)
                .build();

        Parametro parametroSaved = parametroRepository.save(parametro1);

        return payload;
    }

    @MessageMapping("/simulator.addUser")
    @SendTo("/channel/public")
    public String  addUser(@Payload String payload, SimpMessageHeaderAccessor headerAccessor) {

        // Add username in web socket session
        headerAccessor.getSessionAttributes().put("username", payload);
        return payload;
    }
}
