package Practico_4.Ejercicio_3;

public class EmpleadoHorasExtras extends Empleado {
    private double montoHoraExtra;
    private static double salarioFijo;
    private int cantHorasExtrasTrabajadas;

    public EmpleadoHorasExtras(String nombreEmpresa, String direccionEmpresa, String nombreEmpleado, double montoHoraExtra, int cantHorasExtrasTrabajadas, double salarioFijo) {
        super(nombreEmpresa, direccionEmpresa, nombreEmpleado);
        this.montoHoraExtra = montoHoraExtra;
        this.cantHorasExtrasTrabajadas = cantHorasExtrasTrabajadas;
        EmpleadoHorasExtras.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSalario(){
        return salarioFijo +(cantHorasExtrasTrabajadas * montoHoraExtra);
    }

    public void obtenerHorasExtrasTrabajadas(int horasExtras) {
        this.cantHorasExtrasTrabajadas+=horasExtras;
    }

    /*
    * tambien podria hacer un localTime
    * var para almacenar horas extras
    * int horasExtras = 0;
    *
    * inicio jornada 8:00 am  fin jornada 16:00 pm  = 8 horas diarias por ejemplo
    *  si horasdiaras es menor a horas extras (horas extras es horas diarias + extras = 10, 8 < 10)
    *   for que empiece en horas diarias y menor horas extras (me lo pasan por parametro) por ejemplo 2 horas extras
    *    contador de horas extras
    * return horas extras.
    *
    * */


}
