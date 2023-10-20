package Ejercicio_4;


import Ejercicio_4.Busqueda.Filtro;

import java.util.ArrayList;
import java.util.List;
public class Tablero {
        private int puntajeRequerido;
        private int nivel;
        private List<Ficha> fichas;
        private int dificultad;
        public Tablero(int puntajeRequerido, int nivel){
            this.puntajeRequerido = puntajeRequerido;
            this.nivel = nivel;
            this.fichas = new ArrayList<>();
            this.dificultad = calcularDificultad();
        }

    //Un tablero posee un puntaje mínimo que es necesario alcanzar para pasar al siguiente
    //nivel, una lista de fichas, la dificultad del mismo (se calcula como la sumatoria de todas las
    //fortalezas de las fichas, dividido la sumatoria del poder de destrucción de todas las fichas).

    private int calcularDificultad(){
            int sumaFortaleza = 0, sumaPoder = 0;
            for (Ficha f: fichas){
                sumaPoder += f.getFortaleza();
                sumaFortaleza += f.getPoderDestruccion();
            }
            return sumaFortaleza/sumaPoder;
        }
        public List<Ficha> fichasPoder(Filtro filtro){
            //arreglo de fichas que cumplen
            List<Ficha> fichasQueCumplen = new ArrayList<>();
            for (Ficha f: fichas){
                if (filtro.cumple(f)){
                    fichasQueCumplen.add(f);
                }
            }
            return fichasQueCumplen;
        }

    }

//En cada tablero, se debe poder buscar:
//● Todas las fichas que posean un poder de destrucción mayor a 2
//● Todas las fichas que ocupen más de 4 lugares
//● Todas las fichas que tengan una fortaleza mayor a 5
//● Combinaciones lógicas de los anteriores
