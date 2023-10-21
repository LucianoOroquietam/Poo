package Ejercicio_5;

import Ejercicio_5.Busqueda.BusquedaPorPelicula;

import java.util.ArrayList;

public class Plataforma {
    //Una plataforma de streaming de video permite a sus usuarios consultar su catálogo de
    //películas disponibles.
    private ArrayList<Pelicula> peliculas;

    public Plataforma() {
        this.peliculas = new ArrayList<>();
    }


    public void addPelicula(Pelicula p){
        if (p !=null && !peliculas.contains(p)){
            peliculas.add(p);
        }
    }
    public ArrayList<Pelicula> buscarPelicula(BusquedaPorPelicula buscadorPelicula) {
       ArrayList<Pelicula> peliculasPorCondicion = new ArrayList<>();

        for (Pelicula p:peliculas) {
          if (buscadorPelicula.cumple(p)){
                peliculasPorCondicion.add(p);
            }

        }
        return peliculasPorCondicion;
    }


}
