package Recuperatorio2022.Filtro;

import Recuperatorio2022.Noticia;

public class FiltroAnd extends Filtro{
    private Filtro c1,c2;

    public FiltroAnd(Filtro c1, Filtro c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Noticia n) {
        return c1.cumple(n)&& c2.cumple(n);
    }
}
