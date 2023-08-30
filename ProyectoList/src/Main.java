import Objetos.Lista;

public class Main {

    public static void main(String args[]){

        Lista lista = new Lista();

        lista.agregar("1");
        lista.agregar("2");
        lista.agregar("3");
        lista.agregar("4");
        System.out.println("Tamaño: " + lista.size());
        System.out.println(lista);
        lista.insertar(5, "5");

        lista.eliminarPos(0);
        System.out.println(lista);
    }
}
