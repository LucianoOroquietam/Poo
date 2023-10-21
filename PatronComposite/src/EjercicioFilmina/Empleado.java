package EjercicioFilmina;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Empresa {
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private String especialidad;
    private double sueldo;

    public Empleado(String nombreEmpresa, String ubicacion, String nombreEmpleado, String especialidad, double sueldo, String apellidoEmpleado) {
        super(nombreEmpresa, ubicacion);
        this.nombreEmpleado = nombreEmpleado;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getEspecialidad() {
       // metodo que representa el mismo concepto que  String obtenerEspecialidad();
        //directamente retorno el this.especialidad el objeto
        return especialidad;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getApellidoEmpleado(){
        return this.apellidoEmpleado;
    }

    @Override
    int cantEmpleadoEspecialidad(String especialidad) {
        if (this.especialidad.equals(especialidad)){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    String obtenerEspecialidad() {
        return this.especialidad;
    }

    @Override
    List<Empleado> getEmpleadoEspecialidad(String especialidad) {
        List<Empleado> empleados = new ArrayList<>();
        if (this.especialidad.equals(especialidad)){
            empleados.add(this);
        }
        return empleados;
    }


    @Override
    public boolean equals(Object o){
        try {
            Empleado e  = (Empleado) o;
            return this.getNombre().equals(e.getNombre()) &&
                    this.getApellidoEmpleado().equals(e.getApellidoEmpleado());
        }catch (Exception exc){
            return false;
        }
    }
}
