package Practico_4.Ejercicio_2;

public class mainAlarmaEj2 {
    public static void main(String[] args) {
        Alarma alarma = new Alarma();
        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa();

        Sensor sensorVidrio = new Sensor("Zona Vidrio de la sala de estar");
        Sensor sensorPuerta = new Sensor("Zona Puerta de entrada");
        Sensor sensorPasos = new Sensor("Zona de pasos");
        Sensor sensorPatio = new Sensor("Zona patio");
        Sensor sensorGarage = new Sensor("Zona Garage");

        //System.out.println(alarma);

        alarma.agregarSensor(sensorVidrio);
        alarma.agregarSensor(sensorPuerta);
        alarma.agregarSensor(sensorPasos);
        alarma.agregarSensor(sensorPatio);
        alarma.agregarSensor(sensorGarage);

        alarmaLuminosa.agregarSensor(sensorVidrio);
        alarmaLuminosa.agregarSensor(sensorPuerta);
        alarmaLuminosa.agregarSensor(sensorPasos);
        alarmaLuminosa.agregarSensor(sensorPatio);
        alarmaLuminosa.agregarSensor(sensorGarage);

        sensorVidrio.setIntrusosDetectado(true);
        sensorPuerta.setIntrusosDetectado(false);
        sensorPasos.setIntrusosDetectado(true);
        sensorPatio.setIntrusosDetectado(true);
        sensorGarage.setIntrusosDetectado(false);

        //System.out.println(alarma);

        //alarma.comprobarIntruso();
        alarmaLuminosa.comprobarIntruso();




    }
}

/*
*
* 2- Alarma Sensorial
Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma se
cambien por sensores que poseen un comportamiento y pueden sondear diferentes partes de
la casa. Cada sensor posee el nombre de la zona que controla. Permitir que se incorporen
nuevos sensores. Modificar la alarma para que además de hacer sonar el timbre, imprima por
pantalla el nombre de la zona en conflicto (pueden ser más de una).
*
* arreglo de sensores
* pos1 = vidrio
* pos2 = puerta
* pos3 = intruso
* agrego nuevas como por ejemplo :
* pos4 = patio
* pos5 = garage
* */
