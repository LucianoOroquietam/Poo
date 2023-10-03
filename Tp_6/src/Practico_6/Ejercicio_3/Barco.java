package Practico_6.Ejercicio_3;

public class Barco extends OrdenColaEspera{

    private double capacidad;

    public Barco(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    @Override
    public boolean esMayor(OrdenColaEspera elemento) {
        try {
            Barco b = (Barco) elemento;
            return this.getCapacidad() > b.getCapacidad();
        }catch (Exception e){
            return false;
        }

    }
}
