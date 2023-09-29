package Practico_4.Ejercicio_5;

import java.time.LocalDate;

public class ProductoCongelado extends InformacionProducto{
    private int codigoOrganismo;
    private LocalDate fecha_envasado;
    private double tempRecomendada;
    private String granjaOrigen;

    public ProductoCongelado(LocalDate fecha_vencimiento, int nroLote, String nombreProducto, int codigoOrganismo, LocalDate fecha_envasado, double tempRecomendada, String granjaOrigen) {
        super(fecha_vencimiento, nroLote, nombreProducto);
        this.codigoOrganismo = codigoOrganismo;
        this.fecha_envasado = fecha_envasado;
        this.tempRecomendada = tempRecomendada;
        this.granjaOrigen = granjaOrigen;
    }

    public int getCodigoOrganismoCongelado() {
        return codigoOrganismo;
    }

    public LocalDate getFecha_envasadoCongelado() {
        return fecha_envasado;
    }

    public double getTempRecomendadaCongelado() {
        return tempRecomendada;
    }

    public String getGranjaOrigenCongelado() {
        return granjaOrigen;
    }

    @Override
    public String toString() {
        return "ProductoCongelado{" +
                ",Producto=" + getNombreProducto() +
                ", nroLote=" +getNroLote() +
                ", fechaVencimiento=" + getFecha_vencimiento() +
                ", codigoOrganismo=" + codigoOrganismo +
                ", fecha_envasado=" + fecha_envasado +
                ", tempRecomendada=" + tempRecomendada + " grados" +
                ", granjaOrigen='" + granjaOrigen + '\'' +
                '}';
    }
}
