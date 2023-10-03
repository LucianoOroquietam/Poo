package Practico_6.Ejercicio_1;

public class AlquilerVehiculo extends AlquilerItem {

    private String marca;
    private double kms;
    private String patente;
    private boolean disponible;

    public AlquilerVehiculo(String nombre, int cantidadCopiasDisponibles, String marca, double kms, String patente) {
        super(nombre, cantidadCopiasDisponibles);
        this.marca = marca;
        this.kms = kms;
        this.patente = patente;
    }

    @Override
    public boolean sePuedeAlquilar() {
        if (estaDisponible()){
            //una vez q lo alquilo , no lo puede volver a alquilar
            disponible = false;
            return true;
        }
        return false;
    }

    public boolean estaDisponible(){
        return disponible;
    }

    @Override
    public boolean alquilar() {
        return  sePuedeAlquilar();
    }

    @Override
    public void devolverItem() {
        disponible = true;
    }

}
