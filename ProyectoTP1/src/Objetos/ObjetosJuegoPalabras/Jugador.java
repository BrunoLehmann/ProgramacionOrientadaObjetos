package Objetos.ObjetosJuegoPalabras;

import Objetos.ObjetosLista.Lista;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.LinkedList;

public class Jugador {
    private String nombre;
    private LinkedList<Palabra> listaPalabras = new LinkedList<Palabra>();
    private Integer puntaje;
    private static Diccionario diccionario = new Diccionario();

    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public Integer getPuntaje() {
        int puntos = 0;
        Palabra palabra;

        for(int i = 0; i < listaPalabras.size(); i++) {
            palabra = listaPalabras.get(i);
            puntos = puntos + palabra.getPuntaje();
        }
        puntaje = puntos;
        return puntaje;
    }

    private Boolean palabraValida(String palabra){
        return diccionario.buscarPalabra(palabra);
    }

    public String agregarPalabra(String palabra) {
        String res = "La Palabra es Invalida";
        if (palabraValida(palabra)) {
            Palabra objPalabra = new Palabra(palabra);
            listaPalabras.add(objPalabra);
            res = "La Palabra es Valida";
        }
        return res;
    }

    public String toString(){
        return "Jugador: " + nombre + " Puntaje: " + puntaje;
    }

    public String getNombre() {
        return nombre;
    }
}
