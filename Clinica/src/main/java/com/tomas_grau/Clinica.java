package com.tomas_grau;

import com.tomas_grau.Entidades.Medico;
import com.tomas_grau.Entidades.ObraSocial;

import java.util.ArrayList;
import java.util.List;


public class Clinica {
    public static void main(String[] args) {
        Medico eusebio_medico = new Medico("Eusebio", "Fernández", "Cardiólogo");
        Medico carlos_medico = new Medico("Carlos", "Medicina","Urólogo");


        List<Medico> lista_medico1 = new ArrayList<>();
        lista_medico1.add(eusebio_medico);
        lista_medico1.add(carlos_medico);

        List<Medico> lista_medico2 = new ArrayList<>();
        lista_medico1.add(maria_medico);


        ObraSocial obrasocial_1 = new ObraSocial("OSEP",lista_medico1);
        ObraSocial obrasocial_2 = new ObraSocial("DAMSU",lista_medico2);



    }
}