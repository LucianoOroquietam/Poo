package Farmacia.condiciones;

import Farmacia.Medicamento;
import Farmacia.condiciones.Condicion;

public class CondicionLaboratorio extends Condicion {

    private String labQueBusco;

    public CondicionLaboratorio(String labQueBusco) {
        this.labQueBusco = labQueBusco;
    }
    //devolver todos los medicamentos del lab bayer
    @Override
    public boolean cumple(Medicamento m) {
        return m.getLaboratorio().equalsIgnoreCase(labQueBusco);
    }

    @Override
    public String toString() {
        return "CondicionLaboratorio{" +
                "labQueBusco='" + labQueBusco + '\'' +
                '}';
    }
}
