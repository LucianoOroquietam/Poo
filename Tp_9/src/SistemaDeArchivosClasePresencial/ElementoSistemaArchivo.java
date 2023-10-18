package SistemaDeArchivosClasePresencial;

import java.time.LocalDate;

public abstract class ElementoSistemaArchivo {

    //no hago una interfaz porque hay cosas en comun (atributos) entre una carpeta y un archivo (nombre , fecha creacion , etc)
    //entonces yo deberia poder abstraer en una clase padre (ElementoSistemaArchivo)

    private String nombre;
    private LocalDate fechaCreacion;

    public ElementoSistemaArchivo(String nombre, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getTamanio();
    public abstract int cantArchivos();


}
