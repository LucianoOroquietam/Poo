package Practico_5.Ejercicio_2;

import java.util.ArrayList;
public class Casa {
    private String nombreCasa; //griffyndor - slytherin
    private ArrayList<String> cualidadesObligatoria; //valor y astucia -- ambicion, inteligencia, astucia.
    private ArrayList<Alumno> alumnos;
    private int cantMaximaAlumnoAdmitido; //200 - 100
    private int cantAlumno; //cant actual



    public Casa(int cantMaximaAlumnoAdmitido, String casa) {
        this.cantMaximaAlumnoAdmitido = cantMaximaAlumnoAdmitido;
        this.cantAlumno = 0;
        this.nombreCasa = casa;
        this.cualidadesObligatoria = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    public ArrayList<String> getCualidadesObligatoria() {
        return cualidadesObligatoria;
    }

    public void setNombreCasa(String nombreCasa) {
        this.nombreCasa = nombreCasa;
    }

    public ArrayList<Alumno> getNombreAlumno(){
        return this.alumnos;
    }


    public void agregarAlumno(Alumno alumno){

        if (cantAlumno < cantMaximaAlumnoAdmitido && esAceptado(alumno)){
            //si alumno no tiene casa
            if (alumno.getCasa()==null) {
                //Agrego alumno
                alumnos.add(alumno);

                //aumento la cantidad de alumnos en 1
                cantAlumno++;

                //agrego alumno = harry a la casa = grifyndor
                alumno.setCasa(this);
            }
        }else {
            System.out.println(alumno.getNombre() + " No cumple con las condiciones para entrar en la casa" + alumno.getCasa());
        }
    }

    public void agregarCasa(String casa){
        nombreCasa.add(casa);
    }
    public void agregarCualidadCasa(String casa){
        cualidadesObligatoria.add(casa.toLowerCase());
    }

    public boolean esAceptado(Alumno alumno){
        //si alumno tiene todas las cualidades de la casa y no esta en otra casa
        return alumno.getCualidades().containsAll(cualidadesObligatoria);
    }





}
