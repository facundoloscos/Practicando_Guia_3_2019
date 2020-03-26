package com.company;

public class Libro {
    //Atributos
    private String titulo;
    private int precio;
    private int stock;
    private Autor autor;

    //Metodos

    public Libro(String titulo, int precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getStock() {
        return stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor +
                '}';
    }

    public String mostrarCool(){
        return "El libro, "+getTitulo()+" de "+autor.getNombre()+". Se vende a "+getPrecio()+" pesos.";
    }
}
