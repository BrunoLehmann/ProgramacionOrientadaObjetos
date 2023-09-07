package Objetos.ObjetoContraseña;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Random;

public class Contrasena {
    private String contrasena;
    private Integer longitud = 8;

    private String listaRandom[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public void generarContrasena(Integer longitud) {


    }

    public Boolean esFuerte() {
        Boolean cumpleMayus = cuentaCoincidencias(2, contrasena.toUpperCase());
        Boolean cumpleMinus = cuentaCoincidencias(1, contrasena.toLowerCase());
        Boolean cumpleNumeros = cuentaNumeros(2);

        return ((cumpleMayus)&&(cumpleMinus)&&(cumpleNumeros));
    }


    public Boolean cuentaCoincidencias(int cant, String contrasenaAComparar) {
        /*
        Esta funcion cuenta hasta que haya mas de 'cant' de letras exactamente iguales que en el atributo contrasena del objeto.
        */
        int contador = 0;
        int indice = 0;

        while ((contador < cant + 1) && (indice < longitud)) {
            if (contrasena.charAt(indice) == contrasenaAComparar.charAt(indice)) {
                contador = contador + 1;
            }
            indice = indice + 1;
        }
        return contador == cant;
    }

    public Boolean cuentaNumeros(int cant) {
        int contador = 0;
        int indice = 0;
        char letraContrasena;
        while ((contador < cant) && (indice < longitud)) {
            letraContrasena = contrasena.charAt(indice);
            if ((Character.getNumericValue(letraContrasena) >-1) && (Character.getNumericValue(letraContrasena) < 10))  {
                contador = contador + 1;
                indice = indice + 1;
            }
        }
        return contador == cant;

    }
}

