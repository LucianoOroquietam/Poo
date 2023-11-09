package Ejercicio_8;

import Ejercicio_8.Filtro.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public class PlaylistSponsoreada extends Playlist{
    private Video videoSponsor;
    public PlaylistSponsoreada(String titulo) {
        super(titulo);
    }


    //Estos elementos tienen la particularidad de que si
    //se les pide un listado de videos, siempre agregan al principio del resultado un video
    //particular, aunque no cumpla con la condición de búsqueda.
    // Notar que este video puede variar con el tiempo y debe poder cambiarse en tiempo de ejecución.

    public ArrayList<Video> busquedas(Filtro condicion, Comparator<Video> orden) {

       ArrayList<Video>resultado = new ArrayList<>();
       resultado.add(videoSponsor);
       resultado.addAll(super.busquedas(condicion,orden));

       return resultado;

    }

    public void setVideoSponsor(Video videoSponsor) {
        this.videoSponsor = videoSponsor;
    }
}
