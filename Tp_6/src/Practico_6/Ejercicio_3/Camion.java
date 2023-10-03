package Practico_6.Ejercicio_3;

import java.time.LocalDate;

public class Camion extends OrdenColaEspera {

    private LocalDate fechaDeCarga;

    @Override
    public boolean esMayor(OrdenColaEspera elemento) {
        try {
            Camion c = (Camion) elemento;
            return this.fechaDeCarga.isBefore(c.fechaDeCarga);
        }catch (Exception e){
            return false;
        }
    }
}
