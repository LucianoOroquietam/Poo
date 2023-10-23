package Ejercicio_2.Filtros;

import Ejercicio_2.Socio;

public class FiltroAlquiler extends FiltroSocio{

    private double pagoAlquiler;

    public FiltroAlquiler(double pago) {
        this.pagoAlquiler = pago;
    }

    //Todos los socios que pagaron más de $500 por algún alquiler de cancha,

    @Override
    public boolean cumple(Socio s) {
        return s.pagoMasDe(this.pagoAlquiler) ;
    }
}
