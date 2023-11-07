package Practico_4.Ejercicio_2;
import java.util.ArrayList;
public class Alarma {
    protected ArrayList<Sensor> sensores;
    private Timbre timbre;


    public Alarma() {
        sensores = new ArrayList<>();
        timbre = new Timbre();
    }

    public void agregarSensor(Sensor sensor){
        sensores.add(sensor);
    }

    public void comprobarIntruso(){
        boolean zonaEnRiesgo = false;
        System.out.println("entro al comprobar intruso");
        //recorro todos los sensores
        for (Sensor sensor : sensores) {
            //pregunto uno x uno si detecto algo
            System.out.println("entro al for");
            if (sensor.detectarIntrusion()) {
                System.out.println("entro al if");
                zonaEnRiesgo = true;
                System.out.println(obtenerInfoZonaEnPeligro(sensor));
            }
        }
        if (zonaEnRiesgo){
            timbre.hacerSonar();
        }
    }

    public String obtenerInfoZonaEnPeligro(Sensor sensor) {
        return "Zona en peligro: " + sensor.getZonaControlada() ;
    }


    @Override
    public String toString() {
        return "Alarma{" +
                "sensores=" + sensores +
                '}';
    }
}
