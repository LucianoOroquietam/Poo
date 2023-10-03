package Practico_6.Ejercicio_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaAlquiller {
    private ArrayList<Cliente>clientes;
    private ArrayList<Alquiler>alquiler;


    public SistemaAlquiller(){
        this.clientes = new ArrayList<>();
        this.alquiler= new ArrayList<>();
    }

    public void addCliente(Cliente c){
        if(c!=null && !clientes.contains(c)){
            clientes.add(c);
        }
    }

    public void addAlquiler(Alquiler a){
        if(a!=null && !alquiler.contains(a)){
            alquiler.add(a);
        }
    }


    public ArrayList<Cliente> getClientesAlquilerVencido() {
      ArrayList<Cliente> alquilerVencido = new ArrayList<>();

      for (int i =0; i<alquiler.size(); i++){
          Alquiler a = alquiler.get(i);
          if (alquilerVencido(a)){
            alquilerVencido.add(a.getCliente());
          }
      }
      return alquilerVencido;
    }

    public boolean alquilerVencido(Alquiler a){
        //la fecha actual es posterior a la fecha vencimiento (si es true esta vencido)
        return LocalDate.now().isAfter(a.getFechaVencimiento());
    }


}






