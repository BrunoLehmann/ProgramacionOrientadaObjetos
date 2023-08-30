package Objetos;

public class Nodo {
    private Object dato;
    private Nodo siguiente;

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
       return dato;
    }

    public void setProximo(Nodo siguiente){
        this.siguiente = siguiente;
    }

    public Nodo getProximo(){
        return siguiente;
    }
}
