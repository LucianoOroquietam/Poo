package Recuperatorio2022;

import Recuperatorio2022.Filtro.Filtro;

import java.util.ArrayList;

public class Noticia extends Portal{
    private String contenido,titulo,autor;
    private ArrayList<String>palabrasClaves;


    public Noticia(String cat, String contenido, String titulo, String autor) {
        super(cat);
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.palabrasClaves = new ArrayList<>();
    }

    public void addPclaves(String s){
        if (!palabrasClaves.contains(s))
            palabrasClaves.add(s);
    }

    @Override
    public ArrayList<String> calcularPalabrasClave() {
        return new ArrayList<>(palabrasClaves);
    }

    public String getContenido() {
        return contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public Portal getCopia(Filtro condicion) {

       if (condicion.cumple(this)){
           Noticia copia = new Noticia(this.getCategoria(),getContenido(),getTitulo(),getAutor());
           for (String str:palabrasClaves) {
               copia.addPclaves(str);
           }
        return copia;
       }
      return null;
    }

    @Override
    public int compareTo(Portal o) {
        return this.getCategoria().compareTo(o.getCategoria());
    }
}
