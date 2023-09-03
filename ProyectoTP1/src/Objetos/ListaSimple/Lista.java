package Objetos.ListaSimple;

public class Lista {
    private NodoListaSimple primerNodoListaSimple;

    public Lista crearLista(){
        primerNodoListaSimple = null;
        return this;
    }

    public Boolean esVacia(){
        return (primerNodoListaSimple == null);
    }

    public Integer size(){
        Integer cantidad = 1;
        NodoListaSimple nodoListaSimpleAux = primerNodoListaSimple;

        while (nodoListaSimpleAux.getProximo() != null){
            nodoListaSimpleAux = nodoListaSimpleAux.getProximo();
            cantidad += 1;
        }
        return cantidad;
    }

    public void agregar(Object dato){
        NodoListaSimple nuevoNodoListaSimple = new NodoListaSimple();
        nuevoNodoListaSimple.setDato(dato);

        if(this.esVacia()){
            primerNodoListaSimple = nuevoNodoListaSimple;
        }else{
            NodoListaSimple nodoListaSimpleAux = primerNodoListaSimple;
            while(nodoListaSimpleAux.getProximo() != null){
                nodoListaSimpleAux = nodoListaSimpleAux.getProximo();
            }
        nodoListaSimpleAux.setProximo(nuevoNodoListaSimple);
        }
    }

    public Object recuperar(Integer posicion){
        Integer index = 0;
        Object dato = null;
        NodoListaSimple nodoListaSimpleAux = primerNodoListaSimple;
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
                NodoListaSimple nodoListaSimpleAux = primerNodoListaSimple;
                NodoListaSimple nodoListaSimpleAnterior = null;
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
        NodoListaSimple nuevoNodoListaSimple = new NodoListaSimple();
        nuevoNodoListaSimple.setDato(dato);

        if(posicion == 0){
            nuevoNodoListaSimple.setProximo(primerNodoListaSimple);
            primerNodoListaSimple = nuevoNodoListaSimple;
        }else if(posicion > 0) {
            Integer index = 0;
            NodoListaSimple nodoListaSimpleAux = primerNodoListaSimple;
            NodoListaSimple nodoListaSimpleAnt = null;
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
        NodoListaSimple nodoListaSimpleAux = primerNodoListaSimple;
        while(nodoListaSimpleAux != null){
            acumulador += (String) nodoListaSimpleAux.getDato() +  "\n";
            nodoListaSimpleAux = nodoListaSimpleAux.getProximo();
        }
    return acumulador;
    }


}
