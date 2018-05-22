package com.zieg.simuladorcardiopulmonarservice.Repository;

import com.zieg.simuladorcardiopulmonarservice.Model.Parametro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParametroRepository extends MongoRepository<Parametro, Integer> {

}
