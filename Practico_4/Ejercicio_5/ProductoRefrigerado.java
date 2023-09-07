package Practico_4.Ejercicio_5;

import java.time.LocalDate;
import java.time.LocalTime;

public class ProductoRefrigerado extends InformacionProducto {
    private int codigoOrganismo;
    private LocalDate fecha_envasado;
    private double tempRecomendada;
    private String granjaOrigen;

    public ProductoRefrigerado(LocalDate fecha_vencimiento, int nroLote, String nombreProducto, int codigoOrganismo, LocalDate fecha_envasado, double tempRecomendada, String granjaOrigen) {
        super(fecha_vencimiento, nroLote, nombreProducto);
        this.codigoOrganismo = codigoOrganismo;
        this.fecha_envasado = fecha_envasado;
        this.tempRecomendada = tempRecomendada;
        this.granjaOrigen = granjaOrigen;
    }

    public int getCodigoOrganismoRefrigerado() {
        return codigoOrganismo;
    }

    public LocalDate getFecha_envasadoRefrigerado() {
        return fecha_envasado;
    }

    public double getTempRecomendadaRefrigerado() {
        return tempRecomendada;
    }

    public String getGranjaOrigenRefrigerado() {
        return granjaOrigen;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" +
                "nombre=" + getNombreProducto() +
                "nroLote=" +getNroLote() +
                "fechaVencimiento=" + getFecha_vencimiento() +
                "codigoOrganismo=" + codigoOrganismo +
                ", fecha_envasado=" + fecha_envasado +
                ", tempRecomendada=" + tempRecomendada +
                ", granjaOrigen='" + granjaOrigen + '\'' +
                '}';
    }
}


