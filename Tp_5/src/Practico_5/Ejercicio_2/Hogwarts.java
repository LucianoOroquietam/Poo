package Practico_5.Ejercicio_2;

public class Hogwarts {
    public static void main(String[] args) {
        //instancias
        Casa griffyndor = new Casa(200);
        CasaSangrePura slytherin = new CasaSangrePura(100);

        Alumno a1 = new Alumno("Harry potter");
        Alumno a2 = new Alumno("Marcos Roldos");
        Alumno a3 = new Alumno("Luciano Arias");
        Alumno a4 = new Alumno("Tomas Tourn");
        Alumno a5 = new Alumno("Micaela Tourn");

        //cualidades alumno
        a1.agregarCualidadAlumno("valor");
        a1.agregarCualidadAlumno("astucia");
        a2.agregarCualidadAlumno("valor");
        a2.agregarCualidadAlumno("astucia");
        a3.agregarCualidadAlumno("valor");
        a3.agregarCualidadAlumno("astucia");

        a4.agregarCualidadAlumno("Ambicion");
        a4.agregarCualidadAlumno("Inteligencia");
        a4.agregarCualidadAlumno("Astucia");
        a5.agregarCualidadAlumno("Ambicion");
        a5.agregarCualidadAlumno("Inteligencia");
        a5.agregarCualidadAlumno("Astucia");

        //casas y cualidades de casa
        griffyndor.agregarCasa("Griffyndor");
        griffyndor.agregarCualidadCasa("Valor");
        griffyndor.agregarCualidadCasa("Astucia");
        griffyndor.agregarAlumno(a1);
        griffyndor.agregarAlumno(a2);
        griffyndor.agregarAlumno(a3);

        slytherin.agregarCasa("slytherin");
        slytherin.agregarCualidadCasa("Ambicion");
        slytherin.agregarCualidadCasa("Inteligencia");
        slytherin.agregarCualidadCasa("Astucia");
        slytherin.agregarAlumno(a4);
        slytherin.agregarAlumno(a5);

        //agrego familiar
        a1.agregarFamiliar(a1);
        a2.agregarFamiliar(a2);
        a3.agregarFamiliar(a3);
        a5.agregarFamiliar(a4);
        a4.agregarFamiliar(a5);



        System.out.println("cualidades obligatorias de " +griffyndor.getCasa()+ griffyndor.getCualidadesObligatoria());
        System.out.println("cualidades obligatorias de " +slytherin.getCasa()+ slytherin.getCualidadesObligatoria());

        System.out.println(a4.getFamiliar() + " " + a5.getFamiliar());
        System.out.println(a5.getNombre() + " ¿tiene familiares en la casa? " + slytherin.tieneFamiliarEnCasa(a5));



    }
}
