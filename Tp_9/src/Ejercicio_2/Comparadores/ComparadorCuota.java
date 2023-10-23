package Ejercicio_2.Comparadores;

import Ejercicio_2.Socio;

public class ComparadorCuota extends ComparadorSocio {
    public ComparadorCuota() {
    }

    public ComparadorCuota(ComparadorSocio siguiente) {
        super(siguiente);
    }


    @Override
    int comparar(Socio o1, Socio o2) {
        if (o1.isCuotaPagada() && !o2.isCuotaPagada()){
            // negativo para ordenarlo antes
            return -1;
        } else if (!o1.isCuotaPagada() && o2.isCuotaPagada()){
            return 1;
        }
        return 0;
    }

    //-Boolean.compare(s1.isCuotaPaga(),s2.isCuotaPaga());
}
