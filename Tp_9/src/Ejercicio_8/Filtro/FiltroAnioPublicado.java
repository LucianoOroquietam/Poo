package Ejercicio_8.Filtro;

import Ejercicio_8.Video;

import java.time.LocalDate;

public class FiltroAnioPublicado extends Filtro{
    private LocalDate anio;

    public FiltroAnioPublicado(LocalDate anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getAnio_de_publicacion() == this.anio;
    }
}
