package Ejercicio_2.Comparadores;

import Ejercicio_2.Socio;

import java.util.Comparator;

public class CompararPorApellido implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}
