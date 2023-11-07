package Practico_4.Ejercicio_1;

public class Alarma {
    private boolean vidrioRoto;
    private boolean puertaVentanaAbierta;
    private boolean movimientoDetectado;
    private Timbre timbre;

    public Alarma() {
        //estado inicial de la alarma
        vidrioRoto = false;
        puertaVentanaAbierta = false;
        movimientoDetectado = false;
        timbre = new Timbre();
    }

    public void comprobarIntruso() {
        if (vidrioRoto || puertaVentanaAbierta || movimientoDetectado) {
            timbre.hacerSonar();
        }
    }

    protected boolean isVidrioRoto() {
        return this.vidrioRoto;
    }

    protected boolean isPuertaVentanaAbierta() {
        return this.puertaVentanaAbierta;
    }

    protected boolean isMovimientoDetectado() {
        return this.movimientoDetectado;
    }
}



