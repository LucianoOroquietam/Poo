package Ejercicio_2;

import java.time.LocalDate;

public class AlquilerCancha {
    //Cuando un socio alquila una cancha, se registra la fecha, el ID de la cancha que
    //    //alquiló y cuánto pagó por el alquiler
    private LocalDate fechaAlquiler;
    private int id;
    private double pagoCancha;

    public AlquilerCancha(LocalDate fechaAlquiler, int id){
        this.fechaAlquiler = fechaAlquiler;
        this.id = id;
    }

    public AlquilerCancha(LocalDate fechaAlquiler, int id, double pagoCancha) {
        this(fechaAlquiler,id);
        this.pagoCancha = pagoCancha;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public int getId() {
        return id;
    }

    public double getPagoCancha() {
        return pagoCancha;
    }

    public double setPagoCancha(double pago){
       return this.pagoCancha = pago;
    }

}
