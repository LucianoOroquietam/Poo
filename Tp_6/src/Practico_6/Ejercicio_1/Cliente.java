package Practico_6.Ejercicio_1;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private ArrayList<AlquilerItem> items;

    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.items = new ArrayList<>();
    }


}
