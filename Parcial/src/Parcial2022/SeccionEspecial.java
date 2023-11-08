package Parcial2022;


import java.util.ArrayList;
import java.util.Collections;

public class SeccionEspecial extends SeccionCompuesta {
    private String categoriaFija;
    private int cantidadPclaves;

    public SeccionEspecial(String categoria, int pos) {
        super(categoria, pos);
    }

    //Por otro lado, si le solicitan las palabras claves, realiza una unión de
    //todas las palabras claves de las noticias que contiene (eliminando repetidas), las ordena
    //alfabéticamente y sólo retorna las 5 primeras palabras claves de la unión.

    public String getCategoria(){
        return this.categoriaFija;
    }

    public ArrayList<String> calcularpClaves() {
        ArrayList<String>aux = super.calcularpClaves();
        Collections.sort(aux);
        ArrayList<String>pClaves = new ArrayList<>();
            for (int i =0; (i< aux.size() && i<this.cantidadPclaves); i++){
                pClaves.add(aux.get(i));
            }
        return pClaves;
        }

    }

