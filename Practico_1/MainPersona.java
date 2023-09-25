package Practico_1;
import java.time.LocalDate;
public class MainPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona("30890456");
        Persona persona2 = new Persona("40289369", "Luciano", "Oroquieta");
        Persona persona3 = new Persona("13938077", "Diana", "Merlino", LocalDate.of(1960, 1, 8));

        persona1.setNombre("Mariana");
        persona1.setApellido("Roldan");
        persona1.setAltura(1);
        persona1.setPeso(1);
        persona1.calcularEdad();
        persona1.setSexo("Femenino");

        System.out.println(persona1);
        System.out.println("el IMC es de: " + persona1.calcularIMC());
        System.out.println("esta en forma? " + persona1.estaEnForma());
        System.out.println("-------------------------------");

        persona2.setAltura(1.75);
        persona2.setPeso(100);
        persona2.calcularEdad();
        persona2.setFechaNacimiento(LocalDate.of(1997, 5, 19));
        persona2.setSexo("Masculino");

        System.out.println(persona2);
        System.out.println("el IMC es de: " + persona2.calcularIMC());
        System.out.println("¿esta en forma? " + persona2.estaEnForma());
        System.out.println("-------------------------------");

        persona3.setAltura(1.60);
        persona3.setPeso(58);
        persona3.calcularEdad();
        persona3.setSexo("Masculino");
        System.out.println(persona3);

        System.out.println("el IMC es de: " + persona3.calcularIMC());
        System.out.println("esta en forma? " + persona3.estaEnForma());

        System.out.println("-------------------------------");

        Persona persona = new Persona("12345678", "Juan", "Pérez", LocalDate.of(2023, 8, 17));
        if (persona.estaCumpliendoAnios()) {
            System.out.println("¡Feliz cumpleaños, " + persona.getNombre() + "!");
        } else {
            System.out.println("Hoy no es tu cumpleaños, " + persona.getNombre() + ".");
        }

        Persona persona4 = new Persona("12345678", "Juan", "Pérez", LocalDate.of(2018, 1, 1));

        if (persona4.esMayorDeEdad()) {
            System.out.println(persona4.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(persona4.getNombre() + " no es mayor de edad.");
        }

        Persona persona5 = new Persona("12345678", "Carlos", "Pérez", LocalDate.of(2008, 1, 1));

        if (persona5.puedeVotar()) {
            System.out.println(persona5.getNombre() + " puede votar.");
        } else {
            System.out.println(persona5.getNombre() + " no puede votar.");
        }

        if (persona5.esCoherente()) {
            System.out.println(persona2.getNombre() + " tiene una fecha de nacimiento coherente con su edad.");
        } else {
            System.out.println(persona2.getNombre() + " tiene una fecha de nacimiento incoherente con su edad.");
        }

    }
}

