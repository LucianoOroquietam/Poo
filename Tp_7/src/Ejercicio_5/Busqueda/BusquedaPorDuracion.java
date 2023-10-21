package Ejercicio_5.Busqueda;

import Ejercicio_5.Pelicula;

public class BusquedaPorDuracion extends BusquedaPorPelicula{
    private int duracion;

    public BusquedaPorDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getDuracion() < this.duracion;
    }
}
