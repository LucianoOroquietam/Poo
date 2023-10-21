package Ejercicio_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GuardarArchivoPlugin implements Plugin {
    private String path;

    public GuardarArchivoPlugin(String filePath) {
        this.path = filePath;
    }

    @Override
    public void ejecutar(String textoAGuardar) {
        try {
            Files.write(Paths.get(path), textoAGuardar.getBytes());
            System.out.println("El contenido se ha guardado en el archivo: " + path);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
