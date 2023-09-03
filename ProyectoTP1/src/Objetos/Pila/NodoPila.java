package Objetos.Pila;

public class NodoPila {
    private Object dato;
    private NodoPila siguiente = null;

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Object getDato() {
        return dato;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }


}
