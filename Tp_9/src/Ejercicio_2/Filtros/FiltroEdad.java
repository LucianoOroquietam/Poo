package Ejercicio_2.Filtros;

import Ejercicio_2.Socio;

public class FiltroEdad extends FiltroSocio{

    private int edad;


    public FiltroEdad(int edad) {
        this.edad = edad;
    }

    //Todos los socios menores de edad,
    @Override
    public boolean cumple(Socio s) {
        return s.getEdad() < this.edad;
    }
}
