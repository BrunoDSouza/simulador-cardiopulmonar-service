package com.zieg.simuladorcardiopulmonarservice.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "procedimento")
public class Procedimento {

    private long id;
    private String name;
    private String description;
    private float value;

}
