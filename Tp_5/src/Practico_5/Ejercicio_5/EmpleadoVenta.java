package Practico_5.Ejercicio_5;

public class EmpleadoVenta extends Empleado {
    private double extraPorVenta;
    public EmpleadoVenta(String nombre, String apellido, String dni, double sueldoMensual) {
        super(nombre, apellido, dni, sueldoMensual);
    }

    public double dineroExtra(){
        double sueldo = getSueldoMensual();
        double sueldoTotal = sueldo + extraPorVenta;
        return sueldoTotal ;
    }

    /*
    *la  empresa indicó que algunos de sus empleados se dedican a vender, y
    para motivarlos, aparte del sueldo básico les ofrecen un extra por ventas.
    * Este extra consiste en un porcentaje del total de ventas que haya logrado el empleado durante el mes. Por
    ejemplo, el empleado Martin tiene un sueldo de $15.000, y aparte tiene un extra equivalente
    al 5% de todas sus ventas, en cambio, Pablo tiene un sueldo de $13.000, pero consigue un
    extra equivalente al 10% de sus ventas.
    *
    * */
}
