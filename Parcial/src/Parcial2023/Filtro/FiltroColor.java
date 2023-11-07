package Parcial2023.Filtro;

import Parcial2023.Printer3D;

public class FiltroColor extends Condicion{

    private String color;

    public FiltroColor(String color) {
        this.color = color;
    }

    @Override
    boolean cumple(Printer3D pieza) {
        return pieza.listaColores().contains(this.color);
    }
}
