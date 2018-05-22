package com.zieg.simuladorcardiopulmonarservice;

import com.zieg.simuladorcardiopulmonarservice.Model.Classificacao;
import com.zieg.simuladorcardiopulmonarservice.Model.Parametro;
import com.zieg.simuladorcardiopulmonarservice.Repository.ClassificacaoRepository;
import com.zieg.simuladorcardiopulmonarservice.Repository.ParametroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class BootStrapApplication implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired private ParametroRepository parametroRepository;
    @Autowired private ClassificacaoRepository classificacaoRepository;

    public void InitData(String... args) {

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

        return;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        InitData();
    }
}
