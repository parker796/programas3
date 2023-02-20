package com.example.programa3.Model;

public class Persona {
    private String nombre;
    private String apellidopaterno;

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidopaterno='" + apellidopaterno + '\'' +
                ", apellidomaterno='" + apellidomaterno + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String apellidomaterno;

    private String edad;
}
