package Practico_6.Ejercicio_1;

public abstract class AlquilerItem {

    private String nombre; // Nombre del ítem alquilable
    private double precio;

    public AlquilerItem(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;

    }

    public abstract boolean sePuedeAlquilar(); // Verificar si el ítem puede ser alquilado
    public abstract boolean alquilar(); // Alquilar el ítem
    public abstract void devolverItem(); // Devolver el ítem

}
