package Ejercicio_2.Busqueda;

import Ejercicio_2.Documento;

public class Not extends BuscarPorDocumento{

    private BuscarPorDocumento c1;

    public Not(BuscarPorDocumento c1) {
        this.c1 = c1;

    }

    @Override
    public boolean cumple(Documento d) {
        return !this.c1.cumple(d);
    }
}
