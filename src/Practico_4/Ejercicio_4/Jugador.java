package Practico_4.Ejercicio_4;

import java.time.LocalDate;

public class Jugador extends Persona {
    private String posicion;
    private String piernaHabil;
    private int cantGoles;

    public Jugador(String nombre, String apellido, String numeroPasaporte, LocalDate fecha_nacimiento,String estado, String posicion, String piernaHabil,int goles){
        super(nombre,apellido,numeroPasaporte,fecha_nacimiento,estado);
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
        this.cantGoles = goles;
    }


}
