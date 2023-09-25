package Practico_4.Ejercicio_3;

public class EmpleadoContratado extends Empleado{

    private static double salarioFijo;

    public EmpleadoContratado(String nombreEmpresa, String direccionEmpresa, String nombreEmpleado, double salarioFijo) {
        super(nombreEmpresa, direccionEmpresa, nombreEmpleado);
        EmpleadoContratado.salarioFijo = salarioFijo;

    }

    @Override
    public double calcularSalario(){
        return salarioFijo;
    }
}
