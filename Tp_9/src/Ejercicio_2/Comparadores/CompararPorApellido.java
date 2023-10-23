package Ejercicio_2.Comparadores;

import Ejercicio_2.Socio;

public class CompararPorApellido extends ComparadorSocio {

    public CompararPorApellido() {
    }

    public CompararPorApellido(ComparadorSocio siguiente) {
        super(siguiente);
    }


    @Override
    int comparar(Socio o1, Socio o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}
