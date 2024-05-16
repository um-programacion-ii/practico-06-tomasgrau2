package com.tomas_grau.Entidades;

import java.util.ArrayList;
import java.util.List;

public class ObraSocial {

    private String nombre;
    private List<Medico> listaMedicos;

    public ObraSocial(String nombre, List<Medico> listaMedicos) {
        this.nombre = nombre;
        this.listaMedicos = listaMedicos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(List<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    public void añadirMedicoALista(Medico medico){
        listaMedicos.add(medico);
    }
}
