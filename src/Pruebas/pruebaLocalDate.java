package Pruebas;

import java.time.LocalDate;
import java.time.Period;

public class pruebaLocalDate {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(2006,8,17);
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);
        System.out.println("periodo = " + periodo);

        int anios = periodo.getYears();
        System.out.println("anios = " + anios);
    }
}
