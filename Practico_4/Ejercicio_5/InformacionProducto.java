package Practico_4.Ejercicio_5;

import java.time.LocalDate;
import java.time.LocalTime;

public class InformacionProducto {
    private LocalDate fecha_vencimiento;
    private int nroLote;
    private String nombreProducto;

    public InformacionProducto(LocalDate fecha_vencimiento, int nroLote, String nombreProducto) {
        this.fecha_vencimiento = fecha_vencimiento;
        this.nroLote = nroLote;
        this.nombreProducto = nombreProducto;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public int getNroLote() {
        return nroLote;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }


}


