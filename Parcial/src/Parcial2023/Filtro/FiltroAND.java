package Parcial2023.Filtro;

import Parcial2023.Printer3D;

public class FiltroAND extends Condicion{
    private Condicion c1,c2;

    public FiltroAND(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    boolean cumple(Printer3D pieza) {
        return c1.cumple(pieza) && c2.cumple(pieza);
    }
}
