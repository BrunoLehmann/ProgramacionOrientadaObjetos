import Objetos.Pila;

public class Main {
    public static void main(String[] args) {

        Pila pila = new Pila();
        pila.apilar("1");
        System.out.println("Tope: " + pila.getTope());
        pila.apilar("2");
        System.out.println("Tope: " + pila.getTope());
        pila.apilar("3");
        System.out.println("Tope: " + pila.getTope());
        pila.apilar("4");
        System.out.println("Tope: " + pila.getTope());
        pila.apilar("5");
        System.out.println("Tope: " + pila.getTope());

//Pruebo la funcion pila.toString();
        System.out.println(pila);
        System.out.println("Tope: " + pila.getTope());

        System.out.println("Desapilado 1: " + pila.desapilar());
        System.out.println("Desapilado 2: " +pila.desapilar());
        System.out.println("Desapilado 3: " +pila.desapilar());
        System.out.println("Desapilado 4: " +pila.desapilar());
        System.out.println("Desapilado 5: " +pila.desapilar());
        System.out.println("Desapilado con error: " + pila.desapilar());
    }
}