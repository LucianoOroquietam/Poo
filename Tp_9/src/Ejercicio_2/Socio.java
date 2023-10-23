package Ejercicio_2;

import Ejercicio_2.Filtros.FiltroSocio;

import java.util.ArrayList;

public class Socio implements Comparable<Socio>{

    private String nombre;
    private String apellido;
    private int edad;
    private Boolean ultimaCuota;
    private ArrayList<AlquilerCancha>alquilerCanchas;

    public Socio(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        //todavia no pago nada
        this.ultimaCuota = false;
        this.alquilerCanchas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }


    //una lista que contiene información de los alquileres de canchas que ha
    //realizado.
    public void addCancha(AlquilerCancha alquiler){

      if((alquiler!=null)&&(!alquilerCanchas.contains(alquiler))){
          alquilerCanchas.add(alquiler);
      }
    }

    //metodo para verificar si la cuota esta pagada
    public boolean isCuotaPagada(){
        return this.ultimaCuota;
    }

    public boolean setCuotaPagada(boolean cuota){
      return this.ultimaCuota = cuota;
    }

    //preguntar si el id que me pasan coincide con el numero de la cancha alquilada
    public boolean esLaMismaCancha(int id){
        for (AlquilerCancha a:alquilerCanchas) {
            if (a.getId() == id){
                return true;
            }
        }
        return false;
    }


    public boolean pagoMasDe(double pago){
        for (AlquilerCancha a:alquilerCanchas) {
            //si el pago que recibio la cancha alquilada es mayor o igual al pago que quiero buscar
            if (a.getPagoCancha() >= pago) {
                return true;
            }
        }
        return false;
    }


    //Todos los socios menores de edad, ordenados por edad
    @Override
    public int compareTo(Socio otro) {
        return Integer.compare(this.getEdad(), otro.getEdad());
        //return o1.getEdad() - o2.getEdad();
    }
    // return this.valor - otro.valor; // Orden ascendente
    // Para orden descendente: return otro.valor - this.valor;


}
