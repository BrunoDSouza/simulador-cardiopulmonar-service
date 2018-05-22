package com.zieg.simuladorcardiopulmonarservice.Repository;

import com.zieg.simuladorcardiopulmonarservice.Model.Paciente;
import com.zieg.simuladorcardiopulmonarservice.Model.Parametro;
import com.zieg.simuladorcardiopulmonarservice.Model.Types.Sexo;
import com.zieg.simuladorcardiopulmonarservice.Model.Types.TipoSanguineo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import static org.junit.Assert.*;


public class PacienteRepositoryTest {


    @Autowired
    private PacienteRepository pacienteRepository;

    @Before
    public void setUp() throws Exception {

        Paciente paciente = Paciente.builder()
                                .name("Bruno")
                                .peso(75.6)
                                .altura(175)
                                .tipoSanguineo(TipoSanguineo.A)
                                .sexo(Sexo.MASCULINO)
                                .build();

        Paciente paciente2 = Paciente.builder()
                                .name("Daysie")
                                .peso(58.6)
                                .altura(175)
                                .tipoSanguineo(TipoSanguineo.A)
                                .sexo(Sexo.MASCULINO)
                                .build();



        pacienteRepository.save(paciente);
        pacienteRepository.save(paciente2);

        assertNotNull(paciente.getId());
        assertNotNull(paciente2.getId());

    }

    @Test
    public void testDataUpdate(){

//        Paciente paciente = pacienteRepository.findByNome("Bruno");
//        paciente.setPeso(80.0);
//
//        pacienteRepository.save(paciente);
//        Paciente paciente_new = pacienteRepository.findByNome("Bruno");
//
//        assertEquals("Valores dos campos são iguais",80.0, paciente_new.getPeso());

    }

    @Test
    public void findByNomeTest() {
//        String expected = "Bruno";
//        Paciente paciente = pacienteRepository.findByNome(expected);
//
//        assertNotNull(paciente);
//        assertEquals("Metodo retornou com sucesso", expected, paciente.getName());

    }

    @After
    public void tearDown() throws Exception {

        pacienteRepository.deleteAll();

    }


}