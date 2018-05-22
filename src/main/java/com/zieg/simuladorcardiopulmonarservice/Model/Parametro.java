package com.zieg.simuladorcardiopulmonarservice.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.Nullable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "parametro")
public class Parametro {

    @Id
    private String id;
    private String name;
    private String description;
    private float vl_max;
    private float vl_min;
    private float vl_default;

    @Nullable
    private float value;


    private Classificacao classificacao;

}
