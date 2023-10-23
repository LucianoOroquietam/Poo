package Ejercicio_2.Comparadores;

import Ejercicio_2.Socio;

public class CompararPorEdad extends ComparadorSocio {

    public CompararPorEdad(){

    }
    public CompararPorEdad(ComparadorSocio siguiente){
        super(siguiente);
    }
    @Override
    int comparar(Socio o1, Socio o2) {
        return Integer.compare(o1.getEdad(), o2.getEdad());
        //return o1.getEdad() - o2.getEdad();
    }


}
