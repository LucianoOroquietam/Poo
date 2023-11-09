package Ejercicio_8.Filtro;

import Ejercicio_8.Video;

public class FiltroOr extends Filtro{

    private Filtro c1,c2;

    public FiltroOr(Filtro c1, Filtro c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Video v) {
        return c1.cumple(v) || c2.cumple(v);
    }
}
