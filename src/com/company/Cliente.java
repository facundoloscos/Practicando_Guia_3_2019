package com.company;

public class Cliente {
    //Atributos
    private int idCliente;
    private String nombre;
    private char genero;

    //Metodos

    public Cliente(int idCliente, String nombre, char genero) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }

    public String getNombre() {
        return nombre;
    }
}
