package com.zieg.simuladorcardiopulmonarservice.Model;


import com.zieg.simuladorcardiopulmonarservice.Model.Types.Sexo;
import com.zieg.simuladorcardiopulmonarservice.Model.Types.TipoSanguineo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.Nullable;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "paciente")
public class Paciente {

    @Id
    private String id;
    private String name;
    private double peso;
    private double altura;
    private Sexo sexo;
    private TipoSanguineo tipoSanguineo;

    @Nullable
    private List<Parametro> parametros;

}
