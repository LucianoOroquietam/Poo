package Practico_6.Ejercicio_1;


import java.time.LocalDate;

public abstract class AlquilerItem {


    private String nombre; // Nombre del ítem alquilable
    private int cantidadCopiasDisponibles; // Cantidad de copias disponibles




    // Constructor
    public AlquilerItem(String nombre, int cantidadCopiasDisponibles) {
        this.nombre = nombre;
        this.cantidadCopiasDisponibles = cantidadCopiasDisponibles;
    }

    public abstract boolean sePuedeAlquilar(); // Verificar si el ítem puede ser alquilado
    public abstract void alquilar(); // Alquilar el ítem
    public abstract boolean estaVencido(); // Verificar si el alquiler está vencido
}
