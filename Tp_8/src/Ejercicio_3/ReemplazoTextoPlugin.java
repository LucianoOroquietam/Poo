package Ejercicio_3;

public class ReemplazoTextoPlugin implements Plugin {


    private String palabraIngresada;
    private String palabraEspecifica;
    private String textoModificado;

    public ReemplazoTextoPlugin(String palabraIngresada, String palabraEspecifica) {
        this.palabraIngresada = palabraIngresada;
        this.palabraEspecifica = palabraEspecifica;
    }

    //Reemplaza una palabra específica en el texto actual por otra
    //palabra ingresada por el usuario.

    @Override
    public void ejecutar(String texto) {
        //cambio la palabra especifica por la palabra ingresada por el usuario
        textoModificado = texto.replace(palabraEspecifica, palabraIngresada);
    }

    //si quiero obtener el texto modificado (no lo pide el ejercicio)
    public String getTextoModificado() {
        return textoModificado;
    }
}
