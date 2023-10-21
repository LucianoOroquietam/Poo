package Ejercicio_2;

import java.util.ArrayList;

public class Documento {

    //Un documento tiene un título, una lista de autores, un contenido textual y una lista de
    //palabras clave.

    private String titulo;
    private ArrayList<String>autores;

    private String contenidoTextual;

    private ArrayList<String>palabrasClaves;


    public Documento(String titulo, String contenidoTextual) {
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.contenidoTextual = contenidoTextual;
        this.palabrasClaves = new ArrayList<>();
    }


    public String getTitulo() {
        return titulo;
    }

    public ArrayList<String> getAutores() {
        return new ArrayList<>(autores);
    }

    public String getContenidoTextual() {
        return contenidoTextual;
    }

    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<>(palabrasClaves);
    }
}
