package Egresados2021.Filtros;

import Egresados2021.ElementoEmpresa;

public class FiltroDeudaMayor extends Filtro{

    private double deuda;

    public FiltroDeudaMayor(double deuda) {
        this.deuda = deuda;
    }

    @Override
    public boolean cumple(ElementoEmpresa e) {
        return e.getDeuda() > deuda;
    }
}
