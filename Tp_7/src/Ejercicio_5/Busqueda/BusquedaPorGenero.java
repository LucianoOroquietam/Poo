package Ejercicio_5.Busqueda;

import Ejercicio_5.Pelicula;

public class BusquedaPorGenero extends BusquedaPorPelicula{

    private String genero;

    public BusquedaPorGenero(String genero) {
        this.genero = genero;
    }

    //Buscar todas las películas que contengan un género específico (por ejemplo,
    //    //“terror”).

    @Override
    public boolean cumple(Pelicula p) {
        return p.getGenero().contains(this.genero);
    }
}
