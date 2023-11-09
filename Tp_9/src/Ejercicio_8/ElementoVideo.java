package Ejercicio_8;

import Ejercicio_8.Filtro.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoVideo {
    private String titulo;

    public ElementoVideo(String titulo) {
        this.titulo = titulo;
    }

    public abstract ArrayList<Video> busquedas(Filtro condicion , Comparator<Video> orden);
    public abstract ArrayList<String>getpClaves();

    public abstract int cantidadVideos();

    public abstract double getDuracion();
}
