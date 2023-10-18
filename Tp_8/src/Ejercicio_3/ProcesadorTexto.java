package Ejercicio_3;

public class ProcesadorTexto {
    private String texto;

    public ProcesadorTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void ejecutarPlugin(Plugin plugin){
        //permita ejecutar cualquier plugin pasado como parámetro y
        // el mismo se aplica al texto del documento actual.
        plugin.ejecutar(this.texto);
    }
}
