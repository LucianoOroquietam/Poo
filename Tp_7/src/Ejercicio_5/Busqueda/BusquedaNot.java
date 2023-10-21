package Ejercicio_5.Busqueda;

import Ejercicio_5.Pelicula;

public class BusquedaNot extends BusquedaPorPelicula{

    BusquedaPorPelicula c1;

    public BusquedaNot(BusquedaPorPelicula c1) {
        this.c1 = c1;

    }

    @Override
    public boolean cumple(Pelicula p) {
        return !this.c1.cumple(p);
    }
}
