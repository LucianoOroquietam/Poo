package SistemaDeArchivosClasePresencial;

import java.time.LocalDate;

public class Archivo extends ElementoSistemaArchivo{


    private double tamanioArchivo;
    private String extension;


    public Archivo(String nombre, double tamanioArchivo, String extension, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
        this.tamanioArchivo = tamanioArchivo;
        this.extension = extension;

    }


    public double getTamanioArchivo() {
        return tamanioArchivo;
    }

    public String getExtension() {
        return extension;
    }



    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public double getTamanio() {
        return getTamanioArchivo();
    }

    @Override
    public int cantArchivos() {
        return 1;
    }


}
