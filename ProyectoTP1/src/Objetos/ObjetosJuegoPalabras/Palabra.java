package Objetos.ObjetosJuegoPalabras;

public class Palabra {
    private final char[] letrasConPuntos = {'k', 'z', 'x', 'y' , 'w'};
    private String palabra;

    private Integer cantLetras;

    private Integer puntaje;

    public Palabra(String palabra){
        this.palabra = palabra;
        puntaje = 0;
        cantLetras = palabra.length();
    }

    public boolean  letraSumaMasPuntos(char letra){
        boolean res = false;
        for(char letraMasPuntos : letrasConPuntos){
            if (letra == letraMasPuntos){
                res = true;
            }
        }
        return res;
    }

    public void calcularPuntaje(){
        puntaje = cantLetras;
        char letra;
        for (int i = 0; i < cantLetras; i++){
            letra = palabra.charAt(i);
            if(letraSumaMasPuntos(letra)){
                puntaje = puntaje + 1;
            }
        }
    }
    public Integer getPuntaje() {
        calcularPuntaje();
        return puntaje;
    }


    public String toString(){
        return palabra;
    }
}
