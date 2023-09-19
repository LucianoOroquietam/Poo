package Practico_5.Ejercicio_5;

public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private double sueldoMensual;

    public Empleado(String nombre, String apellido, String dni, double sueldoMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual(){
        return this.sueldoMensual;
    }
}
