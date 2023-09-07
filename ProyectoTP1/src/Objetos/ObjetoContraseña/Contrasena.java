package Objetos.ObjetoContraseña;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Random;

public class Contrasena {
    private String contrasena;
    private Integer longitud = 8;

    private String listaRandom[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public void generarContrasena(Integer longitud) {
        this.longitud = longitud;
        String letraRandom;
        String contra = "";
        Random numeroAleatorio = new Random();
        int numero;

        for(int i = 0; i < longitud;i++) {
            numero = numeroAleatorio.nextInt(36);
            letraRandom = listaRandom[numero];
            if (numero % 2 == 0) {
                contra = contra + letraRandom;
            }else{
                contra = contra + letraRandom.toUpperCase();
            }
        }

        contrasena = contra;
    }

    public String esFuerte() {
        String res = "Debil";
        Boolean cumpleMayus = cuentaCoincidencias(3, contrasena.toUpperCase());
        Boolean cumpleMinus = cuentaCoincidencias(2, contrasena.toLowerCase());
        Boolean cumpleNumeros = cuentaNumeros(2);

        if((cumpleMayus)&&(cumpleMinus)&&(cumpleNumeros)){
            res = "Fuerte";
        }
        return res;
    }


    public Boolean esNumero(char letra){
        return ((Character.getNumericValue(letra) > -1) && (Character.getNumericValue(letra) < 10));
    }

    public Boolean cuentaCoincidencias(int cant, String contrasenaAComparar) {
        /*
        Esta funcion cuenta hasta que haya mas de 'cant' de letras exactamente iguales que en el atributo contrasena del objeto debo verificar que no sea un numero.
        */
        int contador = 0;
        int indice = 0;
        char letraContrasena;

        while ((contador < cant) && (indice < longitud)) {
            letraContrasena = contrasena.charAt(indice);
            if ((letraContrasena == contrasenaAComparar.charAt(indice)) && (!esNumero(letraContrasena))) {
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
            }
            indice = indice + 1;
        }
        return contador == cant;

    }

    public String getContrasena() {
        return contrasena;
    }
}

