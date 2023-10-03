package Practico_6.Ejercicio_1;

import java.time.LocalDate;

public class AlquilerVehiculo extends AlquilerItem {

    private String marca;
    private double kms;
    private String patente;

    public AlquilerVehiculo(String nombre, int cantidadCopiasDisponibles, String marca, double kms, String patente) {
        super(nombre, cantidadCopiasDisponibles);
        this.marca = marca;
        this.kms = kms;
        this.patente = patente;
    }

    @Override
    public boolean sePuedeAlquilar() {
        return false;
    }

    @Override
    public void alquilar(Cliente cliente, LocalDate fechaDevolucion) {

    }

    @Override
    public boolean estaVencido() {
        return false;
    }
}
