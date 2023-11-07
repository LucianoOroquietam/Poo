package Practico_4.Ejercicio_5;

import java.time.LocalDate;
import java.time.LocalTime;

public class CongeladoPorAgua extends ProductoCongelado{
    private double gramoSal;
    private int litroAgua;

    public CongeladoPorAgua(LocalDate fecha_vencimiento, int nroLote, String nombreProducto, int codigoOrganismo, LocalDate fecha_envasado, double tempRecomendada, String granjaOrigen, double gramoSal, int litroAgua) {
        super(fecha_vencimiento, nroLote, nombreProducto, codigoOrganismo, fecha_envasado, tempRecomendada, granjaOrigen);
        this.gramoSal = gramoSal;
        this.litroAgua = litroAgua;
    }

    public double calcularSalinidad(double gramoSal, int litroAgua){
        double salinidad = gramoSal * litroAgua;
        return salinidad;
    }
}
