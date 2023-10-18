package Ejercicio_3.Busqueda;

import Ejercicio_3.Documento;

public class DocumentoPalabraClave extends BuscarPorDocumento {
    //Todos los documentos que contengan una palabra clave dada.

    private String palabraClave;
    public DocumentoPalabraClave(String p){
        palabraClave = p;
    }


    @Override
    public boolean cumple(Documento d) {
        return d.getPalabrasClaves().contains(this.palabraClave);
    }
}
