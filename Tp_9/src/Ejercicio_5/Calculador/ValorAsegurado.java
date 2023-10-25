package Ejercicio_5.Calculador;

import Ejercicio_5.CalcularCosto;
import Ejercicio_5.SeguroSimple;

public class ValorAsegurado extends CalcularCosto {
    private double porcentaje;

    public ValorAsegurado(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double cuantoCuesta(SeguroSimple s) {
        return s.getMontoAsegurado() * porcentaje;
    }
}
