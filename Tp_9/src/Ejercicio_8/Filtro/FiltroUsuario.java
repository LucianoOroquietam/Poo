package Ejercicio_8.Filtro;

import Ejercicio_8.Video;

public class FiltroUsuario extends Filtro{

    private String autor;

    public FiltroUsuario(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Video v) {
        return autor.equals(v.getVideoSubido().getNombre());
    }

}
