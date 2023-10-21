package Ejercicio_2.Busqueda;

import Ejercicio_2.Documento;

public class And extends BuscarPorDocumento{

    private BuscarPorDocumento condicion1,condicion2;

    public And(BuscarPorDocumento condicion1, BuscarPorDocumento condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(Documento d) {
        return this.condicion1.cumple(d) && this.condicion2.cumple(d);
    }




}
