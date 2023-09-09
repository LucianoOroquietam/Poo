package Practico_4.Ejercicio_6;

import java.time.LocalDate;
import java.util.ArrayList;

public class Jerarquico extends Empleado {
    private ArrayList<Empleado>empleadoACargo;

    public Jerarquico(String nombre, String apellido, LocalDate fecha_nacimiento, String cargo, String numeroLegajo, double sueldo) {
        super(nombre, apellido, fecha_nacimiento, cargo, numeroLegajo, sueldo);
        this.empleadoACargo = new ArrayList<>();
    }



    public void agregarPersona(Empleado e){
        //Si e no es nulo y no está en la lista, se agrega a la lista.
        if ((e!=null) && (!empleadoACargo.contains(e))){
            empleadoACargo.add(e);
        }
    }

      /*Otra Forma
    * public void agregarPersona(PersonaEmpresa p) {
    if (p != null) {
        boolean personaYaEnLista = false;

        for (PersonaEmpresa personaExistente : persona) {
            if (personaExistente.equals(p)) {
                personaYaEnLista = true;
                break; // Si la persona ya está en la lista, salimos del bucle
            }
        }

        if (!personaYaEnLista) {
            persona.add(p);
        }
    }
    *
    *   StringBuilder sb = new StringBuilder(super.toString() + "\nEmpleados a Cargo:\n");

        for (Empleado empleado : empleadoACargo) {
            sb.append("nombre: " + empleado.getNombre()).append("\n");
            sb.append("apellido: " + empleado.getApellido()).append("\n");
            sb.append("edad: " + empleado.getEdad()).append("\n");
            sb.append(empleado.toString()).append("\n------------------\n");

        }
        return sb.toString();
}
    * */

    @Override
    public String toString() {
            String result = super.toString() + "\nEmpleados a Cargo:\n";

            for (Empleado empleado : empleadoACargo) {
                result += "nombre: " + empleado.getNombre() + "\n";
                result += "apellido: " + empleado.getApellido() + "\n";
                result += "edad: " + empleado.getEdad() + "\n";
                result += "cargo: " + empleado.getCargo() + "\n";
                result += empleado.toString() + "\n";
                result += "------------------\n";
            }

            return result;
    }



}
