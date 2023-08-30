package Objetos;

public class Lista {
    private Nodo primerNodo;

    public Lista crearLista(){
        primerNodo = null;
        return this;
    }

    public Boolean esVacia(){
        return (primerNodo == null);
    }

    public Integer size(){
        Integer cantidad = 1;
        Nodo nodoAux = primerNodo;

        while (nodoAux.getProximo() != null){
            nodoAux = nodoAux.getProximo();
            cantidad += 1;
        }
        return cantidad;
    }

    public void agregar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);

        if(this.esVacia()){
            primerNodo = nuevoNodo;
        }else{
            Nodo nodoAux = primerNodo;
            while(nodoAux.getProximo() != null){
                nodoAux = nodoAux.getProximo();
            }
        nodoAux.setProximo(nuevoNodo);
        }
    }

    public Object recuperar(Integer posicion){
        Integer index = 0;
        Object dato = null;
        Nodo nodoAux = primerNodo;
        while((index < posicion) && (nodoAux != null)) {
            nodoAux = nodoAux.getProximo();
            index += 1;
        }
        dato = nodoAux.getDato();

        return dato;
    }

    public void eliminarPos(Integer posicion){
        if (posicion <= this.size()) {
            if (posicion > 0) {
                Integer index = 0;
                Nodo nodoAux = primerNodo;
                Nodo nodoAnterior = null;
                while ((nodoAux != null) && (index < posicion)) {
                    nodoAnterior = nodoAux;
                    nodoAux = nodoAux.getProximo();
                    index += 1;
                }
                //Asumo que cuando termina el bucle encuentra la posicion a eliminar. Esto requiere validacion de que posicion < size.
                nodoAnterior.setProximo(nodoAux.getProximo());
            } else {
                primerNodo = primerNodo.getProximo();
            }
        }
    }


    public void insertar(Integer posicion, Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);

        if(posicion == 0){
            nuevoNodo.setProximo(primerNodo);
            primerNodo = nuevoNodo;
        }else if(posicion > 0) {
            Integer index = 0;
            Nodo nodoAux = primerNodo;
            Nodo nodoAnt = null;
            while ((nodoAux != null) && (index < posicion)) {
                nodoAnt = nodoAux;
                nodoAux = nodoAux.getProximo();
                index += 1;
            }
            nodoAnt.setProximo(nuevoNodo);
            nuevoNodo.setProximo(nodoAux);
        }


    }

    public String toString(){
        String acumulador = "";
        Nodo nodoAux = primerNodo;
        while(nodoAux != null){
            acumulador += (String)nodoAux.getDato() +  "\n";
            nodoAux = nodoAux.getProximo();
        }
    return acumulador;
    }


}
