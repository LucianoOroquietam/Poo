package Egresados2021.Filtros;

import Egresados2021.ElementoEmpresa;

public class FiltroAnd extends Filtro{

    private Filtro c1,c2;

    public FiltroAnd(Filtro c1, Filtro c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ElementoEmpresa e) {
        return c1.cumple(e) && c2.cumple(e);
    }
}
