package Objetos.ObjetosLista;

public class NodoSimple {
    private Object dato;
    private NodoSimple siguiente;

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
       return dato;
    }

    public void setProximo(NodoSimple siguiente){
        this.siguiente = siguiente;
    }

    public NodoSimple getProximo(){
        return siguiente;
    }
}
