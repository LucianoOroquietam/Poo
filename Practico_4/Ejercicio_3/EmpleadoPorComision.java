package Practico_4.Ejercicio_3;

public class EmpleadoPorComision extends Empleado {
    private static double sueldoFijo;
    private int cantVentas;
    private double porcentajePorCantidadVentas;

    public EmpleadoPorComision(String nombreEmpresa, String direccionEmpresa, String nombreEmpleado, int cantVentas, double porcentajePorCantidadVentas) {
        super(nombreEmpresa, direccionEmpresa, nombreEmpleado);
        this.cantVentas = cantVentas;
        this.porcentajePorCantidadVentas = porcentajePorCantidadVentas;
    }

<<<<<<< HEAD

    public double calcularSalario(Empleado empleado) {
=======
    @Override
    public double calcularSalario() {
>>>>>>> 96d98ba114e4b1b29cd5036075cf07f2614c7fc9
        return sueldoFijo +(cantVentas * porcentajePorCantidadVentas);
    }
}
