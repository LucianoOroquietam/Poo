package Ejercicio_5.Busqueda;

import Ejercicio_5.Pelicula;
public class BusquedaAnioMenor extends BusquedaPorPelicula{
    private int fechaEmitida;

    public BusquedaAnioMenor(int fechaEmitida) {
        this.fechaEmitida = fechaEmitida;
    }


    @Override
    public boolean cumple(Pelicula p) {
        return p.getAnioEstreno() < this.fechaEmitida;
    }
}
