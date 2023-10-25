package Ejercicio_5.Calculador;

import Ejercicio_5.CalcularCosto;
import Ejercicio_5.SeguroSimple;

public class CalculadorSuma extends CalcularCosto {
    CalcularCosto calc1, calc2;

    public CalculadorSuma(CalcularCosto calc1, CalcularCosto calc2) {
        this.calc1 = calc1;
        this.calc2 = calc2;
    }

    @Override
    public double cuantoCuesta(SeguroSimple s) {
        return calc1.cuantoCuesta(s) + calc2.cuantoCuesta(s);
    }
}
