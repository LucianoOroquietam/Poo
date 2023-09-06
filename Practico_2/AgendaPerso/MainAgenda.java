package Practico_2.AgendaPerso;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class MainAgenda {
    public static void main(String[] args) {

        AgendaPersonal agenda1 = new AgendaPersonal();
        Reunion fechaReunion1 = new Reunion(LocalDate.of(2023,8,30));
        String fecha = fechaReunion1.toString(LocalDate.of(2023,8,30));

        Reunion reunion1= new Reunion("Como programar en java1","mi casa",
                LocalDate.of(2023,8,30),
                LocalTime.of(14,30),
                LocalTime.of(17,30),
                Duration.ofHours(3));

        Reunion reunion2 = new Reunion("Como programar en java2","oficina",
                LocalDate.of(2023,8,30),
                LocalTime.of(17,30),
                LocalTime.of(20,30),
                Duration.ofHours(3));

        Reunion reunion3 = new Reunion("Como programar en java3","meet",
                LocalDate.of(2023,8,30),
                LocalTime.of(20,30),
                LocalTime.of(23,30),
                Duration.ofHours(3));

        Asistente asistente1 = new Asistente("Luciano Oroquieta","2281534974","oroquietaluciano@gmail.com");
        Asistente asistente2 = new Asistente("Tomas Tourn","2494444974","oroquietaluciano@gmail.com");
        Asistente asistente3 = new Asistente("Luciano Arias","2281534974","oroquietaluciano@gmail.com");
        Asistente asistente4 = new Asistente("Francisco Silva","2494534974","oroquietaluciano@gmail.com");
        Asistente asistente5 = new Asistente("Micaela Diaz","2494534974","oroquietaluciano@gmail.com");


        agenda1.agregarReunionAgenda(reunion1);
        agenda1.agregarReunionAgenda(reunion2);
        agenda1.agregarReunionAgenda(reunion3);
        
        reunion1.agregarAsistente(asistente1);
        reunion2.agregarAsistente(asistente2);
        reunion3.agregarAsistente(asistente3);
        reunion3.agregarAsistente(asistente4);
        reunion3.agregarAsistente(asistente5);


        System.out.println("detalle de reuniones :" + agenda1.getReuniones());
        System.out.println("detalle de los asistentes :" + reunion1.getAsistentes());
        System.out.println("detalle de los asistentes :" + reunion2.getAsistentes());
        System.out.println("detalle de los asistentes :" + reunion3.getAsistentes());

        System.out.println("cantidad de reuniones asingadas : " + agenda1.cantidadReuniones() + " el dia " + fecha);
        System.out.println("cantidad de asistentes asingados a la reunion 1 : " + reunion1.cantidadAsistente() + " el dia " + fecha);
        System.out.println("cantidad de asistentes asingados a la reunion 2 : " + reunion2.cantidadAsistente() + " el dia " + fecha);
        System.out.println("cantidad de asistentes asingados a la reunion 3 : " + reunion3.cantidadAsistente() + " el dia " + fecha);





    }
}
