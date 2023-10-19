package EjercicioFilmina;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Empresa {
    private String nombreEmpleado;
    private String especialidad;
    private double sueldo;

    public Empleado(String nombreEmpresa, String ubicacion, String nombreEmpleado, String especialidad, double sueldo) {
        super(nombreEmpresa, ubicacion);
        this.nombreEmpleado = nombreEmpleado;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    int cantEmpleadoEspecialidad(String especialidad) {
        if (getEspecialidad().equals(especialidad)){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    String obtenerEspecialidad() {
        return getEspecialidad();
    }

    @Override
    List<Empleado> getEmpleadoEspecialidad(String especialidad) {
        List<Empleado> empleados = new ArrayList<>();
        if (getEspecialidad().equals(especialidad)){
            empleados.add(this);
        }
        return empleados;
    }
}
