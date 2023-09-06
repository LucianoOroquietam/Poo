package Practico_1;

import java.time.LocalDate;
import java.time.Period;
public class Persona {
    /*
    * Atributos: nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura
    * */
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private String dni;
    private String sexo;
    private double peso;
    private double altura;


//constructor

    public Persona(String dni){
        this.dni = dni;
        this.fechaNacimiento = LocalDate.of(2000, 1, 1);
        nombre = "N";
        apellido = "N";
        edad = 23;
        sexo = "Femenino";
        peso = 1;
        altura = 1;
    }

    public Persona(String dni, String nombre, String apellido){
        this(dni);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento){
        this(dni,nombre,apellido);
        this.fechaNacimiento= fechaNacimiento;
    }

    //getters y setters

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodos
    public double calcularIMC() {
        double imc = peso / (altura * altura);
        return imc;
    }

    // Método para verificar si está en forma
    public boolean estaEnForma() {
        double imc = calcularIMC();
        return imc >= 18.5 && imc <= 25;
    }

    public boolean estaCumpliendoAnios() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getMonthValue() == fechaNacimiento.getMonthValue() &&
                fechaActual.getDayOfMonth() == fechaNacimiento.getDayOfMonth();
    }

    public boolean esMayorDeEdad() {
        LocalDate fechaActual = LocalDate.now();
        // Calcular el período entre la fecha de nacimiento y la fecha actual
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        // Obtener el número de años del período
        int anios = periodo.getYears();
        // Verificar si el número de años es mayor o igual a 18
        return anios >= 18;
    }
    public boolean puedeVotar(){
        /*Saber si puede votar. Es necesario ser mayor de 16 años.*/
        LocalDate fechaActual = LocalDate.now();
        // Calcular el período entre la fecha de nacimiento y la fecha actual
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int anios = periodo.getYears();
        return anios >= 16;
    }

    public boolean esCoherente(){
        //Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
        LocalDate fechaActual = LocalDate.now();
        int anioNacimiento = fechaNacimiento.getYear();
        int anioActual = fechaActual.getYear();
        return (anioActual - anioNacimiento) == calcularEdad();
    }

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    public String toString() {
        return "Nombre: " + nombre + " " + apellido +
                "\nFecha de Nacimiento: " + fechaNacimiento +
                "\nDNI: " + dni +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nedad: " + calcularEdad() +
                "\nAltura: " + altura;
    }
}


/*
    public boolean esMayorDeEdad() {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Calcular la fecha en la que la persona cumpliría 18 años
        LocalDate fechaMayorEdad = fechaNacimiento.plusYears(18);

        // Comparar si la fecha actual es posterior o igual a la fecha de mayoría de edad
        return fechaActual.isAfter(fechaMayorEdad) || fechaActual.isEqual(fechaMayorEdad);
    } */