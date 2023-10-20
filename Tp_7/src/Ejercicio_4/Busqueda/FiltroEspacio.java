package Ejercicio_4.Busqueda;

import Ejercicio_4.Ficha;

public class FiltroEspacio extends Filtro{

    //Todas las fichas que ocupen más de 4 lugares
    private int espacio;

    public  FiltroEspacio(int espacio){
        this.espacio = espacio;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getEspacio() > this.espacio;
    }
}
