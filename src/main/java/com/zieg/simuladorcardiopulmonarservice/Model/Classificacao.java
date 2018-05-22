package com.zieg.simuladorcardiopulmonarservice.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.Nullable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "classificacao")
public class Classificacao {

    @Id
    private String id;
    private String name;

    @Nullable
    private String description;

}
