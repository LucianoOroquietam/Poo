package Ejercicio_8;

import java.time.LocalDate;

public class VideoClave extends Video{
    public VideoClave(String titulo, int duracion, int cantVisualizaciones, Usuario videoSubido, int like, int dislike, LocalDate anio_de_publicacion) {
        super(titulo, duracion, cantVisualizaciones, videoSubido, like, dislike, anio_de_publicacion);
    }

    public boolean contienePalabra(String palabra){
        return true;
    }
}
