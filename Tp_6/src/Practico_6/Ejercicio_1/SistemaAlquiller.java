package Practico_6.Ejercicio_1;

import java.util.ArrayList;

public class SistemaAlquiller {
    private ArrayList<AlquilerPelicula>peliculas;
    private ArrayList<AlquilerVehiculo>vehiculos;


    public SistemaAlquiller(){
        this.peliculas = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
    }

    public void addVehiculo(AlquilerVehiculo v){

    }

    public void addPelicula(AlquilerPelicula p){}

    public ArrayList<AlquilerPelicula> getPeliculas() {
        return new ArrayList<>(peliculas);
    }

    public ArrayList<AlquilerVehiculo> getVehiculos() {
        return new ArrayList<>(vehiculos);
    }
}






