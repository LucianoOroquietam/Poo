package Practico_4.Ejercicio_6;

import java.time.LocalDate;
import java.time.Period;

public class PersonaEmpresa {
    private String nombre;
    private String apellido;
    private int edad;
    private String cargo;
    private LocalDate fecha_nacimiento;

    public PersonaEmpresa(String nombre, String apellido, LocalDate fecha_nacimiento, String cargo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCargo() {
        return cargo;
    }

    public int obtenerEdad(){
        LocalDate fecha_actual = LocalDate.now();
        Period periodo = Period.between(fecha_nacimiento, fecha_actual);
        return this.edad = periodo.getYears();

    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\nEdad: " + edad +
                "\nCargo: " + cargo;
    }
}
