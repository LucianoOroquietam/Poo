package PracticaPoo.Herencia.Vehiculos;

public class Moto extends Vehiculo {
   private int anchoManubrio;

    public Moto(String marca, String modelo, String patente) {
        super(marca, modelo, patente);
    }

    void hacerWheliee(){
        System.out.println("haciendo la wheliee");
    }
}
