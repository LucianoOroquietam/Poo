package Ejercicio_5.Busqueda;

import Ejercicio_5.Pelicula;

public class BusquedaPeliculaTitulo extends BusquedaPorPelicula{

    private String titulo;

    public BusquedaPeliculaTitulo(String t){
        this.titulo = t;
    }


    @Override
    public boolean cumple(Pelicula p) {
        return p.getTitulo().equalsIgnoreCase(titulo);
    }
    ///● Buscar todas las películas que en el título contenga la palabra “luna”.


}
