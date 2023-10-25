package Ejercicio_5.Filtros;

import Ejercicio_5.SeguroSimple;

public class FiltroOr extends Filtro{

    private Filtro c1,c2;

    public FiltroOr(Filtro c1, Filtro c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(SeguroSimple s) {
        return c1.cumple(s) || c2.cumple(s);
    }
}
