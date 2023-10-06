package Farmacia.condiciones;

import Farmacia.Medicamento;

public class CondicionPrecioMayor  extends Condicion{
    private double precio;

    public CondicionPrecioMayor(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Medicamento m) {
        return m.getPrecio() > precio;
    }
}
