package Ejercicio_8.Filtro;

import Ejercicio_8.Video;

public class FiltroNot extends Filtro{
    private Filtro c1;

    public FiltroNot(Filtro c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Video v) {
        return !c1.cumple(v);
    }
}
