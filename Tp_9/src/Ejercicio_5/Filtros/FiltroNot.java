package Ejercicio_5.Filtros;

import Ejercicio_5.SeguroSimple;

public class FiltroNot extends Filtro{
    private Filtro c1;

    public FiltroNot(Filtro c1) {
        this.c1 = c1;

    }

    @Override
    public boolean cumple(SeguroSimple s) {
        return !c1.cumple(s);
    }
}
