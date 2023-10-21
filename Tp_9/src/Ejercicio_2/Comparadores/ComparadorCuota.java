package Ejercicio_2.Comparadores;

import Ejercicio_2.Socio;

import java.util.Comparator;

public class ComparadorCuota implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
       return Integer.compare(o1.getUltimaCuota(), o2.getUltimaCuota());
    }
}
