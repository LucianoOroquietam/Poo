package Ejercicio_8;

import java.time.LocalDate;

public class Usuario extends Video{

    private String nombre,email;
    private LocalDate anioRegistro;

    public Usuario(String titulo, int duracion, int cantVisualizaciones, Usuario videoSubido, int like, int dislike, LocalDate anio_de_publicacion,
                   String nombre , String email, LocalDate anio) {
        super(titulo, duracion, cantVisualizaciones, videoSubido, like, dislike, anio_de_publicacion);
        this.nombre = nombre;
        this.email = email;
        this.anioRegistro = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}
