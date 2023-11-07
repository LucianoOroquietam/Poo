package Practico_2.SitemaControlGastosPublicos;

public class Ciudad {
    private static final int POBLACION_UMBRAL = 100000;
    private double gastosMantenimiento;
    private String nombreCiudad;
    private double habitantesCiudad;
   private Impuesto impuestoRecaudado;


    public Ciudad(double gastosMantenimiento, String nombreCiudad, double habitantesCiudad, Impuesto impuestoRecaudado){
        this.gastosMantenimiento = gastosMantenimiento;
        this.nombreCiudad = nombreCiudad;
        this.habitantesCiudad = habitantesCiudad;
        this.impuestoRecaudado = impuestoRecaudado;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public boolean gastaMasDeLoQueRecauda(){
        if (habitantesCiudad > POBLACION_UMBRAL){
            double totalImpuestos = impuestoRecaudado.sumaTotalImpuesto();
            return gastosMantenimiento > totalImpuestos;
        }else{
            return false;
        }

    }

    @Override
    public String toString() {
        return "Ciudad{" +
                ", nombreCiudad='" + nombreCiudad + '\'' +
                '}';
    }
}
