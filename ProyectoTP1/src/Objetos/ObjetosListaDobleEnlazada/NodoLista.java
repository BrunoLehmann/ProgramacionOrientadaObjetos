package Objetos.ObjetosListaDobleEnlazada;

public class NodoLista {
    private Object dato;
    private NodoLista proximo;
    private NodoLista anterior;

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setProximo(NodoLista proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(NodoLista anterior) {
        this.anterior = anterior;
    }

    public Object getDato() {
        return dato;
    }

    public NodoLista getAnterior() {
        return anterior;
    }

    public NodoLista getProximo() {
        return proximo;
    }
}
