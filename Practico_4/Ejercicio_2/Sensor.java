package Practico_4.Ejercicio_2;

public class Sensor {
        private String zonaControl;
        private boolean intrusoDetectado;

        public Sensor(String zonaControl) {
            this.zonaControl = zonaControl;
            this.intrusoDetectado = false; // Inicialmente no se detecta intrusión
        }

        public String getZonaControlada() {
            return zonaControl;
        }

        public void setIntrusosDetectado(boolean intrusosDetectados) {
            this.intrusoDetectado = intrusosDetectados;
        }

        public boolean detectarIntrusion() {
            return intrusoDetectado;
        }

    @Override
    public String toString() {
        return "Sensor{" +
                "zonaControl='" + zonaControl + '\'' +
                ", intrusoDetectado=" + intrusoDetectado +
                '}';
    }
}


