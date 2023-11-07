package Practico_4.Ejercicio_4;

import java.time.LocalDate;

public class CuerpoTecnico extends Persona{
    private String cargo;

    private Masajista masajista;
    public CuerpoTecnico(String nombre, String apellido, String numeroPasaporte, LocalDate fecha_nacimiento, String estado, String cargo) {
        super(nombre, apellido, numeroPasaporte, fecha_nacimiento, estado);
        this.cargo = cargo;

    }

    public String getCargo(){
        return this.cargo;
    }

    public boolean esDt(){
        return cargo.equalsIgnoreCase("dt");
    }
    public  boolean esMasajista(){
        return cargo.equalsIgnoreCase("masajista");
    }

}
