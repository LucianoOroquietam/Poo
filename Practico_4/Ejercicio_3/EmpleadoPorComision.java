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


    @Override
    public double calcularSalario() {

        return sueldoFijo +(cantVentas * porcentajePorCantidadVentas);
    }
}
