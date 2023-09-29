package Practico_4.Ejercicio_4;

import java.time.LocalDate;

    public class Masajista extends CuerpoTecnico{

        private String titulo;
        private int aniosExperiencia;

        public Masajista(String nombre, String apellido, String numeroPasaporte, LocalDate fecha_nacimiento, String estado, String cargo, String titulo, int aniosExperiencia) {
            super(nombre, apellido, numeroPasaporte, fecha_nacimiento, estado, cargo);
            if (cargo.equalsIgnoreCase("masajista")){
                this.titulo = titulo;
                this.aniosExperiencia = aniosExperiencia;
            }

        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getAniosExperiencia() {
            return aniosExperiencia;
        }

        public void setAniosExperiencia(int aniosExperiencia) {
            this.aniosExperiencia = aniosExperiencia;
        }

        @Override
        public String toString() {
            return "Masajista{" +
                    " cargo=" + getCargo() +
                    " nombre=" + getNombre() +
                    " apellido=" + getApellido() +
                    "titulo='" + titulo + '\'' +
                    ", aniosExperiencia=" + aniosExperiencia +
                    '}';
        }
    }
