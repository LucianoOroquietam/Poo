package Practico_6.Ejercicio_1;

import java.time.LocalDate;

public class AlquilerPelicula extends AlquilerItem {
    private String informacionFilmografica;
    private int cantCopia;

    public AlquilerPelicula(String nombre, int cantidadCopiasDisponibles, String informacionFilmografica, int cantCopia) {
        super(nombre, cantidadCopiasDisponibles);
        this.informacionFilmografica = informacionFilmografica;
        this.cantCopia = cantCopia;
    }


    //Una película puede ser alquilada si hay copias aún disponibles
    @Override
   public boolean sePuedeAlquilar() {
        if (estaDisponible()){
            restarCopias();
            return true;
        }
        return false;
    }

    @Override
    public boolean alquilar() {
       return sePuedeAlquilar();
    }

    @Override
    public void devolverItem() {
        cantCopia++;
    }


    public boolean estaDisponible() {
        return cantCopia>0;
    }

    public void restarCopias(){
        cantCopia--;
    }
}



