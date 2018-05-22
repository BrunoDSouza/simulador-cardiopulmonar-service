package com.zieg.simuladorcardiopulmonarservice.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "diagnostico")
public class Diagnostico {

    @Id
    private String id;
    private Sintoma sintoma;
    private List<Procedimento> items;

}
