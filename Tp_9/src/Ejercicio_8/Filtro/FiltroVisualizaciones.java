package Ejercicio_8.Filtro;

import Ejercicio_8.Video;

public class FiltroVisualizaciones extends Filtro{

    private int visualizacion;

    public FiltroVisualizaciones(int visualizacion) {
        this.visualizacion = visualizacion;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getCantVisualizaciones() > this.visualizacion;
    }
}
