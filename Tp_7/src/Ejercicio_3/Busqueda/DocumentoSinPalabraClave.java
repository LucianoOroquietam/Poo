package Ejercicio_3.Busqueda;

import Ejercicio_3.Documento;

public class DocumentoSinPalabraClave extends BuscarPorDocumento{

    //Todos los documentos que no contengan ninguna palabra clave.
    private String sinPclave;

    public DocumentoSinPalabraClave(String p){
        this.sinPclave = p;
    }
    @Override
    public boolean cumple(Documento d) {
        return !d.getPalabrasClaves().contains(sinPclave);
    }
}
