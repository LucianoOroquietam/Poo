package Practico_5.Ejercicio_5;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado (Empleado e){
        if (e!=null && !empleados.contains(e)){
            empleados.add(e);
        }else{
            System.out.println("el empleado ya esta en la lista o es nulo");
        }
    }

    //A partir del listado de empleados la empresa desea poder saber la suma total de gastos
    //en sueldos.





}
/*
* Una empresa solicitó crear un sistema para organizar la facturación de sus empleados.
*
Por cada empleado la empresa almacena el nombre, el apellido, el DNI, y el sueldo mensual.
Por ejemplo, el empleado Juan Hernández (DNI: 27.832.123) tiene un sueldo mensual de
$17.000. A su vez, la
*
a) Diseñar en POO las clases necesarias para poder modelar cualquiera de los
empleados. Recuerde utilizar los conceptos vistos en clase.
b) A partir del listado de empleados la empresa desea poder saber la suma total de gastos
en sueldos.
c) ¿Cómo debería modificar mi solución para agregar nuevos tipos de empleados?
Empleado con bonos. Algunos empleados reciben un bono adicional a su sueldo si logran
concretar cierto número de ventas. Por ejemplo, Julián recibe un bono de $1000 si logra
concretar al menos 50 ventas, mientras que Mauro recibe un bono de $3000 si concreta al
menos 100 ventas.
*
*
* */