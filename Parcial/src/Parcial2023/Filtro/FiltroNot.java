package Parcial2023.Filtro;

import Parcial2023.Printer3D;

public class FiltroNot extends Condicion{

    private Condicion c1;

    public FiltroNot(Condicion c1) {
        this.c1 = c1;

    }

    @Override
    boolean cumple(Printer3D pieza) {
        return !c1.cumple(pieza);
    }
}
