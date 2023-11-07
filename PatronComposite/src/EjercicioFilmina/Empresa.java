package EjercicioFilmina;

import java.util.List;

public abstract class Empresa {
    private String nombre;
    private String ubicacion;

    private int numero1;

    public Empresa(String nombre, String ubicacion, int n) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.numero1 = n;
    }

    public int getNumero1() {
        return numero1;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    abstract int cantEmpleadoEspecialidad(String especialidad);
    abstract String obtenerEspecialidad();
    abstract List<Empleado> getEmpleadoEspecialidad(String especialidad);
}
