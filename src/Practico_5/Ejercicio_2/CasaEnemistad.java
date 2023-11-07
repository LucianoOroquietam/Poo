package Practico_5.Ejercicio_2;

public class CasaEnemistad extends Casa {
    private Casa casaEnemiga;

    public CasaEnemistad(int cantMaximaAlumnoAdmitido, Casa casaEnemiga) {
        super(cantMaximaAlumnoAdmitido);
        this.casaEnemiga=casaEnemiga;

    }

    @Override
    public boolean esAceptado(Alumno a){
        //si no cumple con las cualidades de la enemiga pero si cumple con las propias se acepta
        return !a.getCualidades().containsAll(casaEnemiga.getCualidadesObligatoria()) && super.esAceptado(a);
    }
}


