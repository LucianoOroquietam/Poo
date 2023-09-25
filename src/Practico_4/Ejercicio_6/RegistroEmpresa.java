package Practico_4.Ejercicio_6;

import java.time.LocalDate;

public class RegistroEmpresa {



    public static void main(String[] args) {
        Jerarquico j1= new Jerarquico("lucio","gonzales", LocalDate.of(1970,2,22),"senior java","alexJef213",200000);
        Empleado e1= new Empleado("tomas","perez", LocalDate.of(1999,6,22),"junior java","jose2131",200000);
        Empleado e2= new Empleado("fransico","garcia", LocalDate.of(2000,7,22),"front-end","franro21",200000);
        Empleado e3= new Empleado("luciano","oroquieta", LocalDate.of(1997,5,19),"desarrollador web","Lom123",200000);
        UsuarioFinal u1 = new UsuarioFinal("luciano","oroquieta", LocalDate.of(1997,5,19),"desarrollador web","DjLuloxx","lulox123");

        e1.obtenerEdad();
        e2.obtenerEdad();
        e3.obtenerEdad();

        j1.agregarPersona(e1);
        j1.agregarPersona(e2);
        j1.agregarPersona(e3);

        System.out.println(j1);
        System.out.println(u1);

    }



}
