package Objetos.ObjetosLista;

public class Lista {
    private NodoSimple primerNodoListaSimple;

    public Lista crearLista(){
        primerNodoListaSimple = null;
        return this;
    }

    public Boolean esVacia(){
        return (primerNodoListaSimple == null);
    }

    public Integer size(){
        Integer cantidad = 1;
        NodoSimple nodoListaSimpleAux = primerNodoListaSimple;

        while (nodoListaSimpleAux.getProximo() != null){
            nodoListaSimpleAux = nodoListaSimpleAux.getProximo();
            cantidad += 1;
        }
        return cantidad;
    }

    public void agregar(Object dato){
        NodoSimple nuevoNodoListaSimple = new NodoSimple();
        nuevoNodoListaSimple.setDato(dato);

        if(this.esVacia()){
            primerNodoListaSimple = nuevoNodoListaSimple;
        }else{
            NodoSimple nodoListaSimpleAux = primerNodoListaSimple;
            while(nodoListaSimpleAux.getProximo() != null){
                nodoListaSimpleAux = nodoListaSimpleAux.getProximo();
            }
        nodoListaSimpleAux.setProximo(nuevoNodoListaSimple);
        }
    }

    public Object recuperar(Integer posicion){
        Integer index = 0;
        Object dato = null;
        NodoSimple nodoListaSimpleAux = primerNodoListaSimple;
        while((index < posicion) && (nodoListaSimpleAux != null)) {
            nodoListaSimpleAux = nodoListaSimpleAux.getProximo();
            index += 1;
        }
        dato = nodoListaSimpleAux.getDato();

        return dato;
    }

    public void eliminarPos(Integer posicion){
        if (posicion <= this.size()) {
            if (posicion > 0) {
                Integer index = 0;
                NodoSimple nodoListaSimpleAux = primerNodoListaSimple;
                NodoSimple nodoListaSimpleAnterior = null;
                while ((nodoListaSimpleAux != null) && (index < posicion)) {
                    nodoListaSimpleAnterior = nodoListaSimpleAux;
                    nodoListaSimpleAux = nodoListaSimpleAux.getProximo();
                    index += 1;
                }
                //Asumo que cuando termina el bucle encuentra la posicion a eliminar. Esto requiere validacion de que posicion < size.
                nodoListaSimpleAnterior.setProximo(nodoListaSimpleAux.getProximo());
            } else {
                primerNodoListaSimple = primerNodoListaSimple.getProximo();
            }
        }
    }


    public void insertar(Integer posicion, Object dato){
        NodoSimple nuevoNodoListaSimple = new NodoSimple();
        nuevoNodoListaSimple.setDato(dato);

        if(posicion == 0){
            nuevoNodoListaSimple.setProximo(primerNodoListaSimple);
            primerNodoListaSimple = nuevoNodoListaSimple;
        }else if(posicion > 0) {
            Integer index = 0;
            NodoSimple nodoListaSimpleAux = primerNodoListaSimple;
            NodoSimple nodoListaSimpleAnt = null;
            while ((nodoListaSimpleAux != null) && (index < posicion)) {
                nodoListaSimpleAnt = nodoListaSimpleAux;
                nodoListaSimpleAux = nodoListaSimpleAux.getProximo();
                index += 1;
            }
            nodoListaSimpleAnt.setProximo(nuevoNodoListaSimple);
            nuevoNodoListaSimple.setProximo(nodoListaSimpleAux);
        }


    }

    public String toString(){
        String acumulador = "";
        NodoSimple nodoListaSimpleAux = primerNodoListaSimple;
        while(nodoListaSimpleAux != null){
            acumulador += (String) nodoListaSimpleAux.getDato() +  "\n";
            nodoListaSimpleAux = nodoListaSimpleAux.getProximo();
        }
    return acumulador;
    }


}
