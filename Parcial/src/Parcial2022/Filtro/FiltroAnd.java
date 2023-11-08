package Parcial2022.Filtro;

import Parcial2022.Noticia;

public class FiltroAnd extends Condicion{
    private Condicion c1,c2;

    public FiltroAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Noticia n) {
        return c1.cumple(n) && c2.cumple(n);
    }
}
