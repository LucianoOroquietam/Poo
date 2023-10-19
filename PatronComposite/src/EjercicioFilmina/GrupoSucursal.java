package EjercicioFilmina;

import java.util.ArrayList;
import java.util.List;

public class GrupoSucursal extends Empresa{
   private ArrayList<Empresa>empleados;

    public GrupoSucursal(String nombre , String ubicacion){
        super(nombre,ubicacion);
        this.empleados = new ArrayList<>();
    }


    public ArrayList<Empresa> getEmpleados() {
        return new ArrayList<>(empleados);
    }

    @Override
    int cantEmpleadoEspecialidad(String especialidad) {
        int cantidad =0;
        for (Empresa empresa:empleados) {
            cantidad+=empresa.cantEmpleadoEspecialidad(especialidad);
        }
        return cantidad;
    }

    @Override
    public String obtenerEspecialidad() {
        String especialidadMayor = null;
        int cantEspecialidadMayor = 0;

        for (Empresa empleado: empleados){
            //especialidad por empleado
            String especialidad = empleado.obtenerEspecialidad();
            //contador cant de empleado por especialidad
            int cantEspecialidad = cantEmpleadoEspecialidad(especialidad);

            if (cantEspecialidad>cantEspecialidadMayor) {
                cantEspecialidadMayor = cantEspecialidad;
                especialidadMayor = especialidad;
            }
        }
        return especialidadMayor;
    }


    //Obtener todos los empleados de una empresa, sucursal o grupo que tienen una determinada especialidad.
    @Override
    List<Empleado> getEmpleadoEspecialidad(String especialidad) {
        List<Empleado> empleadosConEspecialidad = new ArrayList<>();

        for (Empresa empresa : empleados) {
            List<Empleado> empleadosDeEmpresa = empresa.getEmpleadoEspecialidad(especialidad);
            empleadosConEspecialidad.addAll(empleadosDeEmpresa);
        }

        return empleadosConEspecialidad;
    }
}
