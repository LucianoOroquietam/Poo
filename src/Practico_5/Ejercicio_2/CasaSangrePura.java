package Practico_5.Ejercicio_2;

public class CasaSangrePura extends Casa{
    private Alumno alumno;
    public CasaSangrePura(int cantMaximaAlumnoAdmitido) {
        super(cantMaximaAlumnoAdmitido);
    }

    /*
     * Ahora, además de verificar si el alumno tiene todas las cualidades de la casa y no está en otra casa,
     * también debes verificar si el alumno tiene un familiar en la misma casa.
     */
    @Override
    public void agregarAlumno(Alumno alumno) {
        if (esAceptado(alumno) && tieneFamiliarEnCasa(alumno)) {
            // Si el alumno cumple con todas las condiciones, puedes agregarlo a la casa
            super.agregarAlumno(alumno);
        } else {
            System.out.println(alumno.getNombre() + " No cumple con las condiciones para entrar en la casa " );
        }
    }

    //slytheryn exige que tengas un familiar actualmente en la casa por ejemplo

    public boolean tieneFamiliarEnCasa(Alumno alumno){
        //recorro el arraylist de alumnos getNombreAlumno()
        for (Alumno alumnoCasa : getNombreAlumno()){
            //si la familia contiene al alumno
            if (alumnoCasa.getFamiliar().contains(alumno.getNombre())) {
                return true;
            }
        }
        return false;
    }










}
