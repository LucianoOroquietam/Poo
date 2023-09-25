package Practico_4.Ejercicio_5;

import java.time.LocalDate;
import java.time.LocalTime;

public class CongeladoPorAire extends ProductoCongelado{
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public CongeladoPorAire(LocalDate fecha_vencimiento, int nroLote, String nombreProducto, int codigoOrganismo, LocalDate fecha_envasado, double tempRecomendada, String granjaOrigen, double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
        super(fecha_vencimiento, nroLote, nombreProducto, codigoOrganismo, fecha_envasado, tempRecomendada, granjaOrigen);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }


}
