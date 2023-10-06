package Farmacia.condiciones;

import Farmacia.Medicamento;

public class CondicionPrecioMenor extends Condicion {
    private double precio;

    public CondicionPrecioMenor(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Medicamento m) {
        return m.getPrecio() < precio;
    }
}
