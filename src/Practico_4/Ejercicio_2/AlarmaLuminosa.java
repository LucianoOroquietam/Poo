package Practico_4.Ejercicio_2;

public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa() {
        super();
        luz = new Luz();
    }

    @Override
    public void comprobarIntruso() {
        super.comprobarIntruso();
        luz.encender();
    }
}

