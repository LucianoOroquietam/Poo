package Ejercicio_8.Filtro;

import Ejercicio_8.Video;

public class FiltroLike extends Filtro{

    private int like;

    public FiltroLike(int like) {
        this.like = like;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getLike()>this.like;
    }


}
