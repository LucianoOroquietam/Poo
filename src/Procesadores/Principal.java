package Procesadores;

public class Principal {
    public static void main(String[] args) {
        Procesador p1_Cpu = new ProcesadorCPU();
        Procesador p1_Memoria = new ProcesadorMemoria();
        Procesador p1_Prioridad = new ProcesadorPrioridad();
        Procesador p1_Llegada = new ProcesadorLlegada();

        Tarea t1 = new Tarea(1,60.0,10.0,"Tarea 1");
        Tarea t2 = new Tarea(2,20.0,20.0,"Tarea 2");
        Tarea t3 = new Tarea(3,10.0,30.0,"Tarea 3");
        Tarea t4 = new Tarea(4,80.0,50.0,"Tarea 4");

        p1_Cpu.agregarTarea(t1);
        p1_Cpu.agregarTarea(t2);
        p1_Cpu.agregarTarea(t3);
        p1_Cpu.agregarTarea(t4);

        p1_Memoria.agregarTarea(t1);
        p1_Memoria.agregarTarea(t2);
        p1_Memoria.agregarTarea(t3);
        p1_Memoria.agregarTarea(t4);

        p1_Prioridad.agregarTarea(t1);
        p1_Prioridad.agregarTarea(t2);
        p1_Prioridad.agregarTarea(t3);
        p1_Prioridad.agregarTarea(t4);

        p1_Llegada.agregarTarea(t1);
        p1_Llegada.agregarTarea(t2);
        p1_Llegada.agregarTarea(t3);
        p1_Llegada.agregarTarea(t4);




        System.out.println("----CPU---");
        System.out.println(p1_Cpu);
        System.out.println("----Memoria---");
        System.out.println(p1_Memoria);
        System.out.println("------Prioridad-------");
        System.out.println(p1_Prioridad);
        System.out.println("------Llegada-------");
        System.out.println(p1_Llegada);

    }
}
