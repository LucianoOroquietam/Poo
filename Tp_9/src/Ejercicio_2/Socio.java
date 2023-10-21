package Ejercicio_2;

import java.util.ArrayList;

public class Socio implements Comparable<Socio>{

    private String nombre;
    private String apellido;
    private int edad;
    private Boolean ultimaCuota;
    private ArrayList<AlquilerCancha>alquilerCanchas;

    public Socio(String nombre, String apellido, int edad, Boolean cuota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ultimaCuota = cuota;
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
    public void addCancha(AlquilerCancha cancha){
        boolean encontro = false;
        int i = 0;
        while(!encontro && i < alquilerCanchas.size()){
            //redefino el equals para poder comparar por fecha de alquiler y no por dire memoria
            if(alquilerCanchas.get(i).getFechaAlquiler().equals(cancha.getFechaAlquiler())){
                encontro = true;
            }
            i++;
        }
        if(encontro){
            alquilerCanchas.add(i, cancha);
        } else{
            alquilerCanchas.add(cancha);
        }
    }

    //Todos los socios que alquilaron alguna vez la cancha N°13, ordenados cantidad total de alquileres de esa cancha.

    public int getUltimaCuota() {
        if (ultimaCuota){
            return 1;
        }else {
            return 0;
        }
    }



    @Override
    public int compareTo(Socio otro) {
        return this.getNombre().compareTo(otro.getNombre());
    }


   //a) Todas los socios con cuota impaga, ordenados alfabéticamente (primero por
    //apellido, y si hay varios con el mismo apellido por nombre)
}
