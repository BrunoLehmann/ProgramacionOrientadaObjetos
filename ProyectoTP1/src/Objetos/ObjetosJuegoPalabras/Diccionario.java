package Objetos.ObjetosJuegoPalabras;

import Objetos.ObjetosLista.Lista;

public class Diccionario {
    private Lista listaPalabras; //Utilizo la Lista simplemente enlazada que hicimos puntos anteriores.


    public Diccionario(){
        listaPalabras = new Lista();
        listaPalabras.agregar("HOLA");
        listaPalabras.agregar("BRUNO");
        listaPalabras.agregar("JUEGO");
        listaPalabras.agregar("JUGO");
        listaPalabras.agregar("KIWI");
        listaPalabras.agregar("ESQUIZOFRENIA");
    }
    public void agregarPalabra(String palabra){
        listaPalabras.agregar(palabra);
    }

    public boolean buscarPalabra(String palabra){
        return listaPalabras.busquedaLineal(palabra.toUpperCase());
    }
    public String mostrarPalabras(){
        return listaPalabras.toString();
    }


}
