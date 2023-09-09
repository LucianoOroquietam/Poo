package Practico_4.Ejercicio_6;

import java.time.LocalDate;

public class UsuarioFinal extends PersonaEmpresa {
    private String nombreUsuario;
    private String contrasena;

    public UsuarioFinal(String nombre, String apellido, LocalDate fecha_nacimiento, String cargo, String nombreUsuario, String contrasena) {
        super(nombre, apellido, fecha_nacimiento, cargo);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String toString(){
        return "Nombre empleado : " + getNombre() +
                "\nnombreUsuario " + nombreUsuario +
                "\ncontraseña: " + contrasena;
    }
}
