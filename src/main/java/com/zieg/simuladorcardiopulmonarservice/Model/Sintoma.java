package com.zieg.simuladorcardiopulmonarservice.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "sintoma")
public class Sintoma {

    private long id;
    private String description;
    private List<Parametro> parametros;

}
