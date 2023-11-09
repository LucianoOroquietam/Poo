package Ejercicio_8.Filtro;

import Ejercicio_8.Video;

public class FiltroPclaves extends Filtro{
    private String palabra;

    public FiltroPclaves(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Video v) {
        return v.contienePalabra(this.palabra);
    }
}
