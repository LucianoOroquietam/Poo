package Practico_4.Ejercicio_3;

public class Empleado extends EmpresaInformatica {

    private String nombreEmpleado;

    public Empleado(String nombreEmpresa, String direccionEmpresa, String nombreEmpleado) {
        super(nombreEmpresa, direccionEmpresa);
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double calcularSalario() {
        return 0.0;
    }
}
