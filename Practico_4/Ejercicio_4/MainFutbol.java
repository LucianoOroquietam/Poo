package Practico_4.Ejercicio_4;

import java.time.LocalDate;

public class MainFutbol {


    public static void main(String[] args) {

        Jugador messi = new Jugador("Lionel","Messi","AZB250", LocalDate.of(1987,6,24),"en pais de origen","Delantero", "Zurda", 1000);
        System.out.println(messi.getNombre() + " " + messi.getApellido() + " se encuentra " + messi.getEstado());
        if (messi.estaDisponible()){
            System.out.println(messi.getNombre() + " " + messi.getApellido() +  " esta disponible para un evento solidario");
        }
        CuerpoTecnico scaloni = new CuerpoTecnico("Lionel","Scaloni","123ytr",LocalDate.of(1978,5,16),"En pais de origen","DT");
        CuerpoTecnico scaloni2 = new CuerpoTecnico("Lionel","Scaloni","123ytr",LocalDate.of(1978,5,16),"En pais de origen","DT");

        System.out.println(scaloni.esDt());
        System.out.println(scaloni.esMasajista());
        System.out.println(scaloni);
        System.out.println(scaloni2);

    }

}


/*
* Jugadores --> nombre,apellido,numero de pasaporte, y fecha de nacimiento.
* Cuerpo Tecnico --> nombre,apellido,numero de pasaporte, y fecha de nacimiento.
*
*  los dt poseen un id de la federacion a la que pertenecen,
* los masajistas el titulo que poseen y la cant de años de exp
*
* estados de persona (viajando,concentracion,pais de origen)
* si esta disponible es porque esta en pais origen.
*
* Seleccion de futbol padre de -> jugadores y cuerpo tecnico.
*
* Jugador -- > posicion (delantero por ejemplo) ,pierna habil (zurdo o diestro) , cant de goles convertidos.
* Cuerpo Tecnico --> cargo (dt, masajista, segundo entrenador...) , id (dt por federacion) , titulo (if masajista) , añosExp.
*
* */