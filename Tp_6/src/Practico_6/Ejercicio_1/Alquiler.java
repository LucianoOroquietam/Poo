package Practico_6.Ejercicio_1;

import java.time.LocalDate;

public class Alquiler {
    private AlquilerItem item;
    private LocalDate fechaAlquiler;
    private LocalDate fechaVencimiento;
    private Cliente cliente;

    public Alquiler(AlquilerItem item, LocalDate fechaAlquiler, LocalDate fechaVencimiento, Cliente cliente) {
        this.item = item;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
    }
}
