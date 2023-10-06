package Farmacia.condiciones;

import Farmacia.Medicamento;


public class CondicionPrecio extends Condicion {
    private double precio;

    public CondicionPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Medicamento m) {
        return m.getPrecio() == precio;
    }
}
