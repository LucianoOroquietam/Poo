package Ejercicio_2.Filtros;

import Ejercicio_2.Socio;

public class FiltroIdCancha extends FiltroSocio{

    private int id;

    public FiltroIdCancha(int id) {
        this.id = id;
    }

    //Todos los socios que alquilaron alguna vez la cancha N°13

    @Override
    public boolean cumple(Socio s) {
        return s.esLaMismaCancha(this.id);
    }
}
