package SistemaDeArchivosClasePresencial;

import java.time.LocalDate;

public class AccesoDirecto extends ElementoSistemaArchivo {

    //Los accesos directos siempre “pesan” 1KB
    private static final int TAMANIO_FIJO = 1;
    //Cuando se crean, su nombre se establece por defecto como “Acceso directo a “, seguido del nombre del
    //elemento al que apuntan.
    private static  final String PREFIJO = "acceso directo a ";
    private ElementoSistemaArchivo elementoSistemaArchivo;

    public AccesoDirecto(ElementoSistemaArchivo e, LocalDate fechaCreacion) {

        super(e.getNombre(), fechaCreacion);
        this.elementoSistemaArchivo = e;
    }

    public String getNombre(){
        return PREFIJO + this.elementoSistemaArchivo.getNombre();
    }

    @Override
    public double getTamanio() {
        return TAMANIO_FIJO;
    }

    @Override
    public int cantArchivos() {
        return 0;
    }
}
