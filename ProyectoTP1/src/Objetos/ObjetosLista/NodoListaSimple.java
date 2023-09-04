package Objetos.ObjetosLista;

public class NodoListaSimple {
    private Object dato;
    private NodoListaSimple siguiente;

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
       return dato;
    }

    public void setProximo(NodoListaSimple siguiente){
        this.siguiente = siguiente;
    }

    public NodoListaSimple getProximo(){
        return siguiente;
    }
}
