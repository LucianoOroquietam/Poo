package EjercicioFilmina;

import java.util.List;

public class Main {

        public static void main(String[] args) {
            // Crear empleados
            Empleado empleado1 = new Empleado("Empresa A", "Ubicacion A", "Juan", "Programador", 50000);
            Empleado empleado2 = new Empleado("Empresa B", "Ubicacion B", "Ana", "Diseñador", 45000);
            Empleado empleado4 = new Empleado("Empresa B", "Ubicacion B", "Simona", "Programador", 45000);
            Empleado empleado3 = new Empleado("Empresa C", "Ubicacion C", "Carlos", "Programador", 52000);
            Empleado empleado5 = new Empleado("Empresa B", "Ubicacion B", "Tatiana", "Diseñador", 45000);

            // Crear grupos de sucursal y agregar empleados
            GrupoSucursal grupo1 = new GrupoSucursal("Grupo 1", "Ubicacion 1");
            grupo1.empleados.add(empleado1);
            grupo1.empleados.add(empleado2);
            grupo1.empleados.add(empleado4);


            GrupoSucursal grupo2 = new GrupoSucursal("Grupo 2", "Ubicacion 2");
            grupo2.empleados.add(empleado3);
            grupo1.empleados.add(empleado5);

            // Llamar al método getEmpleadoEspecialidad para obtener empleados con la especialidad "Programador"
            String especialidadBuscada = "Programador";
            List<Empleado> empleadosConEspecialidad = grupo1.getEmpleadoEspecialidad(especialidadBuscada);
            empleadosConEspecialidad.addAll(grupo2.getEmpleadoEspecialidad(especialidadBuscada));

            // Imprimir los empleados con la especialidad "Programador"
            System.out.println("Empleados con especialidad '" + especialidadBuscada + "':");
            for (Empleado empleado : empleadosConEspecialidad) {
                System.out.println("Nombre: " + empleado.getNombreEmpleado() + ", Especialidad: " + empleado.getEspecialidad());
            }

            System.out.println("Empleados con especialidad grupo1 '" + grupo1.cantEmpleadoEspecialidad("Programador") + "':");

            System.out.println("Empleados con especialidad grupo1 '" + grupo1.cantEmpleadoEspecialidad("Diseñador") + "':");

            System.out.println("Empleados con especialidad grupo2 '" + grupo2.cantEmpleadoEspecialidad("Programador") + "':");

            System.out.println("Empleados con especialidad grupo2 '" + grupo2.cantEmpleadoEspecialidad("Diseñador") + "':");

            System.out.println("Empleados con especialidad grupo1 '" + grupo1.obtenerEspecialidad() + "':");

            System.out.println("Empleados con especialidad grupo2 '" + grupo2.obtenerEspecialidad() + "':");
        }
    }

