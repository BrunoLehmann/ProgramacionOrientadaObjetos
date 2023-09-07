import Objetos.ObjetosLista.Lista;
import Objetos.ObjetosListaTareas.AdministradorTareas;

import Objetos.ObjetosPila.Pila;
import Objetos.ObjetosListaDobleEnlazada.ListaDobleEnlazada;
import Objetos.ObjetoContrasena.Contrasena;
import Objetos.ObjetosEcuaciones.EcuacionSegundoGrado;
import Objetos.ObjetosBiblioteca.Libro;
import Objetos.ObjetosCola.Cola;
import Objetos.ObjetosFecha.Fecha;
import Objetos.ObjetosListaTareas.Tarea;
import Objetos.ObjetosListaTareas.Estado;
import Objetos.ObjetosJuegoPalabras.Jugador;




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Trabajo Practico 1.");

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


        //PRUEBA TAREAS

        Tarea superMercado = new Tarea("Ir al supermercado mañana", "10-10-2023", "13-10-2023"); //Falta para la fecha recordatorio
        Tarea consultaAuto = new Tarea("Consultar repuesto del auto", "05-09-2023", "05-09-2023", Estado.COMPLETA); //Fecha de recordatorio es en el dia pero ya esta terminada
        Tarea cine = new Tarea("Ir al cine a ver la nueva película de Marvel", "05-09-2023", "04-09-2023"); //Fecha recordatorio ya paso

        System.out.println(superMercado.mostrarTarea() + " prioridad: " + consultaAuto.getPrioridad());
        System.out.println(consultaAuto.mostrarTarea() + " prioridad: " + consultaAuto.getPrioridad());
        System.out.println(cine.mostrarTarea() + " prioridad: " + cine.getPrioridad());




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





        // PRUEBA CONTRASENAS
        System.out.println("Ingrese longitud de primera contraseña: ");
        int longitud = sc.nextInt();
        Contrasena contra = new Contrasena();
        contra.generarContrasena(longitud);
        System.out.println("La contraseña es: " + contra.esFuerte());
        System.out.println("La contraseña es: " + contra.getContrasena());

        System.out.println("Ingrese longitud de segunda contraseña: ");
        longitud = sc.nextInt();
        Contrasena contra2 = new Contrasena();
        contra2.generarContrasena(longitud);
        System.out.println("La contraseña es : " + contra2.esFuerte());
        System.out.println("La contraseña es: " +contra2.getContrasena());





        //PRUEBAS FECHAS

        Fecha fecha = new Fecha("20-12-2021", "dd-MM-yyyy");
        System.out.println("Primera Fecha: " + fecha.getFecha());
        Fecha fecha2 = new Fecha("12-10-2021", "dd-MM-yyyy");
        System.out.println("Segunda Fecha: " + fecha2.getFecha());
        Fecha fecha3 = new Fecha("22-11-2021", "dd-MM-yyyy");
        System.out.println("Tercera Fecha: " + fecha3.getFecha());

        System.out.println("Fecha2 < Fecha3 < Fecha1 : " + fecha3.estaEntre(fecha2, fecha));
        System.out.println("Fecha 1 > Fecha 2: " + fecha.mayorA(fecha2));
        System.out.println("Fecha 2 > Fecha 1: " + fecha2.mayorA(fecha));



        //PRUEBAS JUEGO PALABRAS

        Jugador j1 = new Jugador("Bruno");
        Jugador j2 = new Jugador("Roman");

        System.out.println(j1.agregarPalabra("hola"));
        System.out.println(j1.agregarPalabra("kiwi"));
        System.out.println(j1.agregarPalabra("zzzz"));
        System.out.println(j1.getPuntaje());
        System.out.println(j2.agregarPalabra("supercalifragilisticoespialidoso"));
        System.out.println(j2.agregarPalabra("bruno"));
        if (j1.getPuntaje() > j2.getPuntaje()){
            System.out.println("Ganador Jugador " + j1.getNombre());
        }else if(j1.getPuntaje() < j2.getPuntaje()){
            System.out.println("Ganador Jugador " + j1.getNombre());
        }else{
            System.out.println("Increible! Hubo un empate.");
        }




        //PRUEBA GESTOR DE TAREAS

        AdministradorTareas gestorTareas = new AdministradorTareas();
        gestorTareas.agregarColaborador("bruno");
        gestorTareas.agregarColaborador("joaquin");
        gestorTareas.agregarTarea("descansar", "12-12-2023","10-12-2023", 2);
        gestorTareas.agregarTarea("leer algun libro", "10-10-2023", "07-09-2023", 10);
        gestorTareas.agregarTarea("hacer trabajos practicos", "27-09-2023", "07-09-2023", 9);
        gestorTareas.agregarTarea("hacer compras", "30-09-2023", "02-09-2023", 8);
        gestorTareas.agregarTarea("ver peliculas con mi novia", "30-09-2023", "01-09-2023", 1);
        gestorTareas.agregarTarea("seguir estudiando", "09-02-2023", "10-12-2023", 6);
        gestorTareas.ordenarTareas();
        gestorTareas.marcarTareaRealizada("ver peliculas con mi novia", "12-10-2023", "Bruno");
        gestorTareas.marcarTareaRealizada("seguir estudiando", "12-10-2023", "Bruno");
        System.out.println(gestorTareas.mostrarTareas());
        System.out.println("Posicion de tarea 'seguir estudiando': " + gestorTareas.buscarTarea("seguir estudiando"));

        System.out.println("Tareas realizadas por colaborador bruno: \n" + gestorTareas.tareasRealizadasPorColaborador("bruno"));
        System.out.println("Tareas realizadas por colaborador joaquin: \n" + gestorTareas.tareasRealizadasPorColaborador("joaquin"));

    }

}
