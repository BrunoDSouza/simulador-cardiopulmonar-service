package com.zieg.simuladorcardiopulmonarservice.Repository;

import com.zieg.simuladorcardiopulmonarservice.Model.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PacienteRepository extends MongoRepository<Paciente, Integer> {


}
