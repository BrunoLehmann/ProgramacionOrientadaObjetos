package Objetos.ObjetosPila;

public class Pila {
    private NodoPila tope = null;

    public Object getTope() {
        return tope.getDato();
    }

    public Boolean esVacia(){
        return (tope == null);
    }

    public void apilar(Object dato) {
        NodoPila nodoNuevo = new NodoPila();
        nodoNuevo.setDato(dato);

        if (esVacia()){
            tope = nodoNuevo;
        }else{
            NodoPila nodoAux = tope;
            tope = nodoNuevo;
            tope.setSiguiente(nodoAux);
        }
    }
    public Object desapilar(){
        Object res = "La pila esta vacia.";
        if(tope != null){
            res = tope.getDato();
            tope = tope.getSiguiente();
        }
        return res;
    }

    public String toString(){
        /*Redefino la funcion toString de la clase Object*/
        Pila pilaAux = new Pila();
        String acumulador = "";
        Object datoIterador;

        while(tope != null){
            datoIterador = this.desapilar();
            acumulador = acumulador + datoIterador + "\n";
            pilaAux.apilar(datoIterador);
        }

        // Reapilo los datos en la pila original
        while(pilaAux.tope != null){
            datoIterador = pilaAux.desapilar();
            this.apilar(datoIterador);
        }

        return acumulador;
    }
}
