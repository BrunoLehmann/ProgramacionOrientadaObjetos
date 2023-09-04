package Objetos.ObjetosCola;

import Objetos.ObjetosLista.NodoSimple;

public class Cola {
    //En este caso utilizo el mismo nodo de la Lista simple ya que es el mismo.
    private NodoSimple inicio = null;

    public Cola crearCola(){
        return this;
    }

    public Boolean esVacia(){
        return inicio == null;
    }

    public Object getInicio(){
        return inicio.getDato();
    }

    public void encolar(Object dato){
        NodoSimple nodoN = new NodoSimple();
        nodoN.setDato(dato);

        if (esVacia()){
            inicio = nodoN;
        }else{
            NodoSimple nodoAux = inicio;
            while(nodoAux.getProximo() != null){
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nodoN);
        }
    }

    public Object desencolar(){

        Object dato = "";
        if(!esVacia()) {
            dato = inicio.getDato();
            inicio = inicio.getProximo();
        }
        return dato;
    }

    public String toString(){
        String acumulador = "";
        NodoSimple nodoAux = inicio;

        while (nodoAux != null){
            acumulador += nodoAux.getDato();
            nodoAux = nodoAux.getProximo();
        }
        return acumulador;
    }

}
