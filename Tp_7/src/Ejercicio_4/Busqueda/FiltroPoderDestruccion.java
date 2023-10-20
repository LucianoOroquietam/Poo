package Ejercicio_4.Busqueda;

import Ejercicio_4.Ficha;

public class FiltroPoderDestruccion extends Filtro{

    private int poder;

    public FiltroPoderDestruccion(int poder) {
        this.poder = poder;
    }

    ///Todas las fichas que posean un poder de destrucción mayor a 2
    @Override
    public boolean cumple(Ficha f) {
        return f.getPoderDestruccion() > this.poder;
    }
}
