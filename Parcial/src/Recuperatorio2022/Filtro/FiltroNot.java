package Recuperatorio2022.Filtro;

import Recuperatorio2022.Noticia;

public class FiltroNot extends Filtro{

    private Filtro c1;

    public FiltroNot(Filtro c1) {
        this.c1 = c1;

    }

    @Override
    public boolean cumple(Noticia n) {
        return !c1.cumple(n);
    }
}
