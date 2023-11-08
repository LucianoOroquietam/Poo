package Recuperatorio2022.Filtro;

import Recuperatorio2022.Noticia;

public class FiltroContenido extends Filtro {

    private String contenido;
    public FiltroContenido(String c){
        this.contenido = c;
    }


    @Override
    public boolean cumple(Noticia n) {
        return n.getContenido().contains(this.contenido);
    }
}
