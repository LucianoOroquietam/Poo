package Ejercicio_2.Filtros;

import Ejercicio_2.Socio;

public class FiltroNot extends FiltroSocio{
    private FiltroSocio c1;

    public FiltroNot(FiltroSocio c1){
        this.c1 = c1;
    }
    @Override
    public boolean cumple(Socio s) {
        return !c1.cumple(s);
    }
}
