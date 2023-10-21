package Ejercicio_2;

import java.time.LocalDate;

public class AlquilerCancha {
    //Cuando un socio alquila una cancha, se registra la fecha, el ID de la cancha que
    //    //alquiló y cuánto pagó por el alquiler
    private LocalDate fechaAlquiler;
    private int id;
    private double pagoCancha;

    public AlquilerCancha(LocalDate fechaAlquiler, int id, double pagoCancha) {
        this.fechaAlquiler = fechaAlquiler;
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        try {
            AlquilerCancha a = (AlquilerCancha) o;
            return this.getFechaAlquiler().equals(a.getFechaAlquiler());
        }catch (Exception exc){
            return false;
        }

    }
}
