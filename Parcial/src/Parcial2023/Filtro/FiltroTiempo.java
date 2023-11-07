package Parcial2023.Filtro;

import Parcial2023.Printer3D;

public class FiltroTiempo extends Condicion{

    private double tiempo;

    public FiltroTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    boolean cumple(Printer3D pieza) {
        return pieza.tiempoEstimado() > this.tiempo;
    }
}
