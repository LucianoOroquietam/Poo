package Farmacia;

import Farmacia.condiciones.Condicion;

import java.util.ArrayList;

public class Farmacia{
  private  ArrayList<Medicamento> medicamentos;

  public Farmacia(){
      this.medicamentos = new ArrayList<>();
  }

    public ArrayList<Medicamento> listarMedicamentos(Condicion c){
      ArrayList<Medicamento> medicamentosQueCumplen = new ArrayList<>();

        for (Medicamento m:medicamentos) {
            if (c.cumple(m)){
                medicamentosQueCumplen.add(m);
            }
        }

       return  medicamentosQueCumplen;
    }

    public void addMedicamento(Medicamento m){
        if (m!=null && !medicamentos.contains(m)){
            medicamentos.add(m);
        }
    }



    @Override
    public String toString() {
        return "Farmacia{" +
                "medicamentos=" + medicamentos +
                '}';
    }
}
