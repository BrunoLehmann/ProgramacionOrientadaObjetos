import Objetos.ObjetosEcuaciones.EcuacionSegundoGrado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Trabajo Practico 1.");
        /*
     //PRUEBA DE LISTA SIMPLE ENLAZADA
        Lista lista = new Lista();

        lista.agregar("1");
        lista.agregar("2");
        lista.agregar("3");
        lista.agregar("4");
        System.out.println("Tamaño: " + lista.size());
        System.out.println(lista);
        lista.insertar(5, "F");

        //lista.eliminarPos(0);
        System.out.println(lista);
        */

        /*
        //PRUEBA PARA LISTA ENLAZADA DOBLE
        ListaDobleEnlazada listaDoble = new ListaDobleEnlazada();

        listaDoble.agregar("1");
        listaDoble.agregar("2");
        listaDoble.agregar("3");
        listaDoble.agregar("4");
        listaDoble.agregar("5");
        listaDoble.agregar("6");
        System.out.println("Tamaño: " + listaDoble.longitud());
        System.out.println(listaDoble);
        listaDoble.insertar(5, "F");

        listaDoble.eliminarPos(3);
        System.out.println(listaDoble);
        */

        /*
        //PRUEBA DE PILA
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
        */

        /*
        //PRUEBA COLA

        Cola cola = new Cola();

        cola.encolar("1");
        cola.encolar("2");
        cola.encolar("3");
        cola.encolar("4");
        cola.encolar("5");

        System.out.println(cola);
        cola.desencolar();
        System.out.println(cola);
        */

        //PRUEBA TAREAS
        /*
        Tarea superMercado = new Tarea("Ir al supermercado mañana", "10/10/2023");
        Tarea consultaAuto = new Tarea("Consultar repuesto del auto", "05/09/2023", Estado.COMPLETA);
        Tarea cine = new Tarea("Ir al cine a ver la nueva película de Marvel", "05/09/2023");

        System.out.println(superMercado.mostrarTarea());
        System.out.println(consultaAuto.mostrarTarea());
        System.out.println(cine.mostrarTarea());
        */


        /*
        //Prueba Libros

        Libro hPotter = new Libro("Harry Potter y La Piedra Filosofal", "J.K Rowling", 557, 10);
        Libro pJackson = new Libro("Percy Jackson y El Ladron del Rayo.", "Rick Riordan", 220, 1);

        System.out.println(hPotter);
        System.out.println(pJackson);
        System.out.println(hPotter.compararPaginas(pJackson));
        System.out.println("Puedo prestar PercyJackson? " +  pJackson.prestarLibro());
        System.out.println("Puedo prestar Harry Potter? " + hPotter.prestarLibro());
        System.out.println("Cantidad de libros prestados totales: " + hPotter.getLibrosPrestadosTotales());
        System.out.println("Presto un Harry Potter mas: " + hPotter.prestarLibro());
        System.out.println("Cantidad de libros prestados totales: " +hPotter.getLibrosPrestadosTotales());

        */

        /*
        // PRUEBA ECUACIONES
        EcuacionSegundoGrado ecuacion1 = new EcuacionSegundoGrado(3, 1, 3);
        EcuacionSegundoGrado ecuacion2 = new EcuacionSegundoGrado(5, 2, 0);
        EcuacionSegundoGrado ecuacion3 = new EcuacionSegundoGrado(3, 0, -5);
        System.out.println("Ecuacion1: " + ecuacion1);
        System.out.println("Ecuacion2: " + ecuacion2);
        System.out.println("Ecuacion3: " + ecuacion3);

        System.out.println("Raicez de ecuacion 1:" + ecuacion1.calcularRaices());
        System.out.println("Ecuacion 1 para X=2 : " + ecuacion1.calcularY(2));

        System.out.println("Raicez de ecuacion 1:" + ecuacion2.calcularRaices());
        System.out.println("Ecuacion 2 para X=0 : " + ecuacion2.calcularY(2));

        System.out.println("Raicez de ecuacion 1:" + ecuacion3.calcularRaices());
        System.out.println("Ecuacion 3 para X = -1 : " + ecuacion3.calcularY(2));

        */

        char a = 'A';
        char z = '0';


        System.out.println(Character.getNumericValue(a));
        System.out.println(Character.getNumericValue(z));

    }

}
