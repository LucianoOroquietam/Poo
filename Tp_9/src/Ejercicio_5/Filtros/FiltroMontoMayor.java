package Ejercicio_5.Filtros;

import Ejercicio_5.SeguroSimple;

public class FiltroMontoMayor extends Filtro{
    private double montoMinimo;

    public FiltroMontoMayor(double montoMayor) {
        this.montoMinimo = montoMayor;
    }

    @Override
    public boolean cumple(SeguroSimple s) {
        return s.getMontoAsegurado() > this.montoMinimo;
    }
}
