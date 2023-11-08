package Parcial2022.Filtro;

import Parcial2022.Noticia;

public class FiltroNot extends Condicion{

    private Condicion c1;

    public FiltroNot(Condicion c1) {
        this.c1 = c1;

    }

    @Override
    public boolean cumple(Noticia n) {
        return !c1.cumple(n);
    }
}
