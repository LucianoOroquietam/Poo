package Parcial2022;

import Parcial2022.Filtro.Condicion;

import java.util.ArrayList;

public class Noticia extends ElementoPortal{
    //De cada noticia se guarda: el contenido (texto), el título, el autor, la
    //categoría (“policial”, “espectáculos”, etc, solo tiene una única categoría) y una lista
    //de palabras claves
    private String contenido,titulo,autor,categoria;
    private ArrayList<String>palabrasClaves;
    private Condicion condicion;

    public Noticia(String c, String titulo, String a, Condicion cond) {
        this.contenido =c;
        this.titulo = titulo;
        this.autor = a;
        this.condicion = cond;
        this.palabrasClaves = new ArrayList<>();
    }

    public void addPclaves(String p){
        if (condicion.cumple(this)){
            if (!palabrasClaves.contains(p))
                palabrasClaves.add(p);
        }
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
    public ArrayList<String> calcularpClaves() {
        return new ArrayList<>(palabrasClaves);
    }

    @Override
    public String getCategoria() {
        return this.categoria;
    }

    @Override
    public ArrayList<Noticia> noticiasQueCumplen(Condicion c) {
        ArrayList<Noticia> lasQueCumplen = new ArrayList<>();
        if (c.cumple(this)){
            lasQueCumplen.add(this);
        }
        return lasQueCumplen;
    }
}
