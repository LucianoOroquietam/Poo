package Ejercicio_2;

import Ejercicio_2.Busqueda.BuscarPorDocumento;

import java.util.ArrayList;

public class Historiador {

    //Un historiador desea digitalizar sus documentos y organizarlos de acuerdo a palabras clave.

    //El historiador necesita poder encontrar fácilmente documentos en su
    //colección de acuerdo a diferentes criterios, por ejemplo:

    private ArrayList<Documento>documentos;


    public Historiador(){
        this.documentos = new ArrayList<>();
    }

    public ArrayList<Documento> buscarDocumentos(BuscarPorDocumento buscador) {
        ArrayList<Documento> documentos1 = new ArrayList<>();
        for (Documento d:documentos) {
            if (d!=null){
                if (buscador.cumple(d)){
                    documentos1.add(d);
                }
            }else{
                return null;
            }

        }
        return documentos1;
    }

    public ArrayList<Documento> getDocumentos() {
        return new ArrayList<>(documentos);
    }


    //a) Todos los documentos cuyo título sea exactamente igual a un título dado.
    //b) Todos los documentos cuyo título contenga una palabra o frase dada.
    //c) Todos los documentos que contengan una palabra clave dada.
    //d) Todos los documentos que no contengan ninguna palabra clave.
    //e) Todos los documentos de un autor determinado.
    //f) Todos los documentos cuyo contenido tenga una palabra o frase dada.
    //g) Todos los documentos cuyo contenido tenga al menos 20 palabras.
    //h) Cualquier combinación lógica de las formas anteriores.
}
