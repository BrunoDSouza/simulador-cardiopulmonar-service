package com.zieg.simuladorcardiopulmonarservice.Repository;

import com.zieg.simuladorcardiopulmonarservice.Model.Classificacao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ClassificacaoRepositoryTest {

    @Autowired
    private ClassificacaoRepository classificacaoRepository;

    @Test
    public void saveTest(){

        Classificacao classificacao = Classificacao.builder()
                                        .description("Ventilação").build();
        Classificacao saved = classificacaoRepository.save(classificacao);

        assertNotNull(saved);


    }

    @Test
    public void findAllTest(){

        List<Classificacao> list = classificacaoRepository.findAll();

        assertNotNull(list);
        assertTrue(list.size() > 0);

    }

}