package Practico_4.Ejercicio_5;

import java.time.LocalDate;
import java.time.LocalTime;

public class ProductoFresco extends InformacionProducto {

    private LocalDate fechaEnvasado;
    private String granjaOrigen;

    public ProductoFresco(LocalDate fecha_vencimiento, int nroLote, String nombreProducto, LocalDate fechaEnvasado, String granjaOrigen) {
        super(fecha_vencimiento, nroLote, nombreProducto);
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }

    public LocalDate getFechaEnvasadoFresco() {
        return fechaEnvasado;
    }

    public String getGranjaOrigenFresco() {
        return granjaOrigen;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" +
                "nombre=" + getNombreProducto() +
                "nroLote=" +getNroLote() +
                "fechaVencimiento=" + getFecha_vencimiento() +
                "codigoOrganismo=" + fechaEnvasado +
                ", fecha_envasado=" + granjaOrigen +
                ", granjaOrigen='" + granjaOrigen + '\'' +
                '}';
    }
}
