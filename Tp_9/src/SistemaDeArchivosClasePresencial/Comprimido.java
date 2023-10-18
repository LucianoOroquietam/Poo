package SistemaDeArchivosClasePresencial;

import java.time.LocalDate;

public class Comprimido extends Carpeta{

    //Los “comprimidos” guardan otros archivos o carpetas y tienen una tasa de compresión
    private double factorCompresion;
    public Comprimido(String nombre, LocalDate fechaCreacion, double factorCompresion) {
        super(nombre, fechaCreacion);
        this.factorCompresion = factorCompresion;
    }

    @Override
    public double getTamanio(){
        return super.getTamanio() * this.factorCompresion;
    }
}
