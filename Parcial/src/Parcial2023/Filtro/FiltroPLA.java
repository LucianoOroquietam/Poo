package Parcial2023.Filtro;

import Parcial2023.Printer3D;

public class FiltroPLA extends Condicion{
    private int pla;

    public FiltroPLA(int pla) {
        this.pla = pla;
    }

    @Override
    boolean cumple(Printer3D pieza) {
        return pieza.cantidadPla() < this.pla;
    }
}
