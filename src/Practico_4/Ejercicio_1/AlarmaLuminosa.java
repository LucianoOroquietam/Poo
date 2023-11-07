package Practico_4.Ejercicio_1;

public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa() {
        super(); // Llama al constructor de la clase padre (Alarma)
        luz = new Luz();
    }

    @Override
    public void comprobarIntruso() {
        super.comprobarIntruso(); // Llama al método de la clase padre (Alarma)
        if (isVidrioRoto() || isPuertaVentanaAbierta() || isMovimientoDetectado()) {
            luz.encender();
        }
    }

}
