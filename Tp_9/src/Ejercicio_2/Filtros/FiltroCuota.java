package Ejercicio_2.Filtros;

import Ejercicio_2.Socio;

public class FiltroCuota extends FiltroSocio{

    private Boolean cuota;

    public FiltroCuota(Boolean cuota) {
        this.cuota = cuota;
    }

    //Todos los socios con cuota impaga
    public boolean cumple(Socio s){
        return s.isCuotaPagada() == this.cuota;
    }
}
