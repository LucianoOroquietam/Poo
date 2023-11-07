package Egresados2021.Filtros;

import Egresados2021.ElementoEmpresa;

public class FiltroNot extends Filtro{
    private Filtro c1;

    public FiltroNot(Filtro c1) {
        this.c1 = c1;

    }

    @Override
    public boolean cumple(ElementoEmpresa e) {
        return !c1.cumple(e) ;
    }
}
