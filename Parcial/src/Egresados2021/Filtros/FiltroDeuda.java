package Egresados2021.Filtros;

import Egresados2021.ElementoEmpresa;

public class FiltroDeuda extends Filtro{
    private double deuda;

    public FiltroDeuda(double deuda) {
        this.deuda = deuda;
    }

    @Override
    public boolean cumple(ElementoEmpresa e) {
        return e.getDeuda() == this.deuda;
    }
}
