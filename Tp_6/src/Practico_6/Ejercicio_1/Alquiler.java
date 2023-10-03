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

    public AlquilerItem getItem() {
        return item;
    }

    public void setItem(AlquilerItem item) {
        this.item = item;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
