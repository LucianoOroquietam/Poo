package EjercicioFilmina;

import java.util.ArrayList;
import java.util.List;

public class GrupoSucursal extends Empresa{
   private ArrayList<Empresa> elementoEmpresa;

    public GrupoSucursal(String nombre , String ubicacion){
        super(nombre,ubicacion);
        this.elementoEmpresa = new ArrayList<>();
    }

    public void add(Empresa e){
        //Debo redefinir el equals
        if (e!=null && !elementoEmpresa.contains(e)){
            elementoEmpresa.add(e);
        }
    }


    public ArrayList<Empresa> getElementoEmpresa() {
        return new ArrayList<>(elementoEmpresa);
    }

    @Override
    int cantEmpleadoEspecialidad(String especialidad) {
        int cantidad =0;
        for (Empresa e: elementoEmpresa) {
            //cantidad + cantidad total de cada hijo
                //e puede ser un grupo , un empelado simple..
            cantidad+=e.cantEmpleadoEspecialidad(especialidad);
        }
        return cantidad;
    }

    @Override
    public String obtenerEspecialidad() {
        String especialidadMayor = null;
        int cantEspecialidadMayor = 0;

        for (Empresa e: elementoEmpresa){
            //especialidad por empleado
            String especialidad = e.obtenerEspecialidad();
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

        for (Empresa e : elementoEmpresa) {
            List<Empleado> empleadosDeEmpresa = e.getEmpleadoEspecialidad(especialidad);
            empleadosConEspecialidad.addAll(empleadosDeEmpresa);
        }

        return empleadosConEspecialidad;
    }


    public boolean equals(Object o){
        try {
            GrupoSucursal g  = (GrupoSucursal) o;
            return this.getNombre().equals(g.getNombre());
        }catch (Exception exc){
            return false;
        }
    }
}
