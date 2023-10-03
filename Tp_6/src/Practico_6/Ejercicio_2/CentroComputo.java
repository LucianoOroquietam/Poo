package Practico_6.Ejercicio_2;
public class CentroComputo {
    private ColaEspera computadoras;
    private ColaEspera procesos;

    public CentroComputo() {
        this.computadoras = new ColaEspera();
        this.procesos = new ColaEspera();
    }


    public void addComputadora(Computadora c){
        if (c==null) return;
        if (procesos.tieneElementos()){
            Proceso proc = (Proceso) procesos.getSiguiente();
            //asigno el proc a la computadora
            c.EjecutarProceso(proc);

        } else{
            //agrego a la cola de espera
            computadoras.addElemento(c);
        }

    }

    //Si no hay computadoras disponibles los procesos a ejecutar deben esperar en una cola de espera

    public void addProceso(Proceso p){
        if (p==null)return;
        if (computadoras.tieneElementos()){
            Computadora libre = (Computadora) computadoras.getSiguiente();
            libre.EjecutarProceso(p);
        }else {
            procesos.addElemento(p);
        }

    }


    public Computadora getSiguienteComputadora(){
        return (Computadora) computadoras.getSiguiente();
    }

    public Proceso getSiguienteProceso(){
        return (Proceso) procesos.getSiguiente();
    }



    @Override
    public String toString() {
        return "CentroComputo{" +
                "computadoras=" + computadoras +
                '}';
    }
}
