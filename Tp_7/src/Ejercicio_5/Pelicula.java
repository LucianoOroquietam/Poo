package Ejercicio_5;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String> generos;
    private String director;
    private ArrayList<String> actores;
    private int anioEstreno;
    private int duracion;
    private int edadMinima;

    public Pelicula(String titulo, String sinopsis, String director,  int anioEstreno, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.generos = new ArrayList<>();
        this.director = director;
        this.actores = new ArrayList<>();
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public ArrayList<String>getGenero() {
        return new ArrayList<> (generos);
    }

    public String getDirector() {
        return director;
    }

    public ArrayList<String>getActor() {
        return new ArrayList<>(actores);
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadMinima(){return edadMinima;}


    public void addGenero(String genero){
        generos.add(genero);
    }
    public void addActores(String actor){
        actores.add(actor);
    }



}
