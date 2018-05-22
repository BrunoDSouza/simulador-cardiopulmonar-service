package com.zieg.simuladorcardiopulmonarservice.Repository;

import com.zieg.simuladorcardiopulmonarservice.Model.Classificacao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClassificacaoRepository extends MongoRepository<Classificacao, Integer> {

    Classificacao findByName(String name);

}
