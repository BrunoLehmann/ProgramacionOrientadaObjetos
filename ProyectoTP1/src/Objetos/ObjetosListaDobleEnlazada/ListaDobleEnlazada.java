package Objetos.ObjetosListaDobleEnlazada;

public class ListaDobleEnlazada {
    NodoLista inicio = null;

    public Boolean esVacia(){
        return (inicio == null);
    }

    public void cearLista(){
        if(this.esVacia()) {
            inicio = new NodoLista();
        }
    }

    public Integer longitud(){
        NodoLista nodoAux = inicio;
        int cantidad = 0;

        while(nodoAux != null){
            nodoAux = nodoAux.getProximo();
            cantidad += 1;
        }

        return cantidad;
    }

    public void agregar(Object dato){
        NodoLista nodoN = new NodoLista();
        nodoN.setDato(dato);

        if(esVacia()){
            inicio = nodoN;
        }else{
            NodoLista nodoAux = inicio;
            while(nodoAux.getProximo() != null){
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nodoN);
            nodoN.setAnterior(nodoAux);
        }
    }

    public void eliminarPos(int pos){
        NodoLista nodoAux = inicio;

        if(pos > 0) {
            int index = 0;
            while (index < pos) {
                nodoAux = nodoAux.getProximo();
                index += 1;
            }
            NodoLista anterior = nodoAux.getAnterior();
            anterior.setProximo(nodoAux.getProximo());
        } else if (pos == 0) {
            inicio = inicio.getProximo();
        }
    }

    public Object recuperar(int pos){
        //En este caso el procedimiento es igual al de la lista simplemente enlazada
        int index = 0;
        Object dato = null;
        NodoLista nodoAux = inicio;
        while((index < pos) && (nodoAux != null)) {
            nodoAux = nodoAux.getProximo();
            index += 1;
        }
        return nodoAux.getDato();
    }

    public void insertar(int pos, Object dato){
        int index = 0;
        NodoLista nodoN = new NodoLista();
        nodoN.setDato(dato);

        NodoLista nodoAux = inicio;
        NodoLista nodoAnt = null;
        if(pos < this.longitud()) {
            if (pos > 0) {
                while (index <= pos) {
                    nodoAnt = nodoAux;
                    nodoAux = nodoAux.getProximo();
                    index += 1;
                    if (index == pos) {
                        nodoAnt.setProximo(nodoN);
                        nodoN.setAnterior(nodoAux.getAnterior());
                        nodoN.setProximo(nodoAux);
                    }
                }
            } else if (pos == 0) {
                nodoN.setProximo(inicio);
                inicio = nodoN;
            }
        }

    }

    public String toString(){
        NodoLista nodoAux = inicio;
        String acumulador = "";

        while (nodoAux != null){
            acumulador += nodoAux.getDato();
            nodoAux = nodoAux.getProximo();
        }

        return acumulador;
    }





}
