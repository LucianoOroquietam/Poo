package Parcial2022.Filtro;

import Parcial2022.Noticia;

public class FiltroContenido extends Condicion{
    private String Contenido;

    public FiltroContenido(String c) {
        this.Contenido = c;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getContenido().contains(this.Contenido);
    }
}
