package PracticaPoo.Herencia;
import PracticaPoo.Herencia.Vehiculos.Auto;

public class MainVehiculo {
    public static void main(String[] args) {
        Auto a = new Auto("TOYOTA","XLS","LOM1997");
        //Moto m = new Moto();

        //v.chequearMotor(); /para usar este metodo debo estar en la clase Vehiculo ya que es privado
        //accedo porq son de tipo public
        a.encender();
        a.acelerar();
        a.frenar();
        System.out.println(a);
        //accedo al get para no romper encapsulamiento
        //System.out.println(m.getMarca());

    }
}
