package PracticaPoo.Herencia.Vehiculos;

public class Vehiculo {
   private String marca;
   private String modelo;
   private String patente;

    public Vehiculo(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    public void acelerar(){
        System.out.println("acelerando");
    }

    public void frenar(){
        System.out.println("frenando");
    }

    public void encender(){
        System.out.println("encendido");
    }

    private void chequearMotor(){
        System.out.println("Chequeando motor....");
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String nuevaMarca){
        if (nuevaMarca!=null){
            this.marca = nuevaMarca;
        }
    }

    //si quiero acceder a algo privado recurrimos al metodo get
    //podemos obtener la marca de una moto plantenado el metodo getter

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", patente='" + patente + '\'' +
                '}';
    }
}
