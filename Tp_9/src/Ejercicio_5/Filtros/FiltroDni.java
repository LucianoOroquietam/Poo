package Ejercicio_5.Filtros;

import Ejercicio_5.ElementoAseguradora;
import Ejercicio_5.SeguroSimple;

public class FiltroDni extends Filtro{
    private int dni;

    public FiltroDni(int dni) {
        this.dni = dni;
    }

    @Override
    public boolean cumple(SeguroSimple s) {
      return s.getDni() == this.dni;
    }
}
