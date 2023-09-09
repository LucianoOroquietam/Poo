package Practico_4.Ejercicio_6;

import java.time.LocalDate;

public class Empleado extends PersonaEmpresa {
    private String numeroLegajo;
    private double sueldo;

    public Empleado(String nombre, String apellido, LocalDate fecha_nacimiento, String cargo, String numeroLegajo, double sueldo) {
        super(nombre, apellido, fecha_nacimiento, cargo);
        this.numeroLegajo = numeroLegajo;
        this.sueldo = sueldo;
    }

    public String toString(){
        return "nombre: " + getNombre() +
                "\nnumeroLegajo: " + numeroLegajo +
                "\nsueldo: " + sueldo;
    }
}
