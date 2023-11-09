package Ejercicio_8;

import Ejercicio_8.Filtro.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Video extends ElementoVideo{


    private int duracion;
    private int cantVisualizaciones;
    private Usuario videoSubido;
    private int like;
    private int dislike;
    private LocalDate anio_de_publicacion;
    private ArrayList<String> pClaves;


    public Video(String titulo, int duracion, int cantVisualizaciones, Usuario videoSubido, int like, int dislike, LocalDate anio_de_publicacion) {
        super(titulo);
        this.duracion = duracion;
        this.cantVisualizaciones = cantVisualizaciones;
        this.videoSubido = videoSubido;
        this.like = like;
        this.dislike = dislike;
        this.anio_de_publicacion = anio_de_publicacion;
        this.pClaves = new ArrayList<>();
    }

    public boolean contienePalabra(String palabra){
        return pClaves.contains(palabra);
    }

    @Override
    public ArrayList<Video> busquedas(Filtro condicion, Comparator<Video> orden) {
        ArrayList<Video>resultado = new ArrayList<>();
        if (condicion.cumple(this)){
            resultado.add(this);
        }

        return resultado;
    }

    public ArrayList<String>getpClaves(){
        return new ArrayList<>(pClaves);
    }

    @Override
    public int cantidadVideos() {
        return 1;
    }

    @Override
    public double getDuracion() {
        return this.duracion;
    }


    public int getCantVisualizaciones() {
        return cantVisualizaciones;
    }

    public Usuario getVideoSubido() {
        return videoSubido;
    }

    public int getLike() {
        return like;
    }

    public int getDislike() {
        return dislike;
    }

    public LocalDate getAnio_de_publicacion() {
        return anio_de_publicacion;
    }
}
