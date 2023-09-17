package Practico_5.Ejercicio_2;

import java.util.ArrayList;

public class Alumno {

    private String nombreAlumno; //harry potter
    private ArrayList<Alumno> familiares; //potter
    private ArrayList<String>cualidades; //(valor,astucia)

    private Casa casa;

    public Alumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.familiares = new ArrayList<>();
        this.cualidades = new ArrayList<>();
        this.casa = null;
    }

    public String getNombre(){
        return this.nombreAlumno;
    }

    public Casa getCasa() {
        return casa;
    }

    public ArrayList<String> getCualidades(){
       return this.cualidades;
    }

    public ArrayList<Alumno> getFamiliar(){
        return this.familiares;
    }


    public void agregarFamiliar(Alumno familiar){ //tipo del array list
        familiares.add(familiar); //le agrego al array list
    }

    public void agregarCualidadAlumno(String cualidad){
        cualidades.add(cualidad.toLowerCase());
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "nombreAlumno='" + nombreAlumno + '\'' +

                ", cualidades=" + cualidades +
                ", casa=" + casa +
                '}';
    }
}
