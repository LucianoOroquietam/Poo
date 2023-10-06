package Farmacia.condiciones;

import Farmacia.Medicamento;
import Farmacia.condiciones.Condicion;

public class CondicionNombre extends Condicion {

    private String nombreMedicamento;

    public CondicionNombre(String n){
        this.nombreMedicamento = n;
    }


    @Override
    public boolean cumple(Medicamento m) {
        //return m.getNombre().equalsIgnoreCase(this.nombreMedicamento);
        return m.getNombre().contains(this.nombreMedicamento);
    }


}
