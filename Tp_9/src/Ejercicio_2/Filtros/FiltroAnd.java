package Ejercicio_2.Filtros;

import Ejercicio_2.Socio;

public class FiltroAnd extends FiltroSocio{

    private FiltroSocio c1,c2;

    public FiltroAnd(FiltroSocio c1, FiltroSocio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Socio s) {
        return c1.cumple(s) && c2.cumple(s);
    }
}
