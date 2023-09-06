package PracticaPoo.Herencia.Vehiculos;

public class Auto extends Vehiculo {
    private boolean tieneAire;

    public Auto(String marca, String modelo, String patente) {
        super(marca, modelo, patente);
    }

    public void prenderAire(){
        if (tieneAire){
            System.out.println("encendiendo aire");
        }
    }


}
