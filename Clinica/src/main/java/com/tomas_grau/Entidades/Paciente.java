package com.tomas_grau.Entidades;

public class Paciente {

    private String nombre;
    private String apellido;
    private String obra_social;

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, String obra_social) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.obra_social = obra_social;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
