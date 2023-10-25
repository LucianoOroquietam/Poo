package Ejercicio_5.Calculador;

import Ejercicio_5.CalcularCosto;
import Ejercicio_5.SeguroSimple;

public class MontoFijo extends CalcularCosto {

    private double montoFijo;

    public MontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double cuantoCuesta(SeguroSimple s) {
        return this.montoFijo;
    }
}
