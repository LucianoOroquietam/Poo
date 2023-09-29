package Practico_4.Ejercicio_5;

import java.time.LocalDate;

public class CongeladoPorNitrogeno extends ProductoCongelado{

    private String metodoCongelacion;
    private int tiempoExposicionSegundos;

    public CongeladoPorNitrogeno(LocalDate fecha_vencimiento, int nroLote, String nombreProducto, int codigoOrganismo, LocalDate fecha_envasado, double tempRecomendada, String granjaOrigen, String metodoCongelacion, int tiempoExposicionSegundos) {
        super(fecha_vencimiento, nroLote, nombreProducto, codigoOrganismo, fecha_envasado, tempRecomendada, granjaOrigen);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicionSegundos = tiempoExposicionSegundos;
    }
}
