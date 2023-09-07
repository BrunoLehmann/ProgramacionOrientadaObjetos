package Objetos.ObjetosEcuaciones;

import static java.lang.Math.sqrt;

public class EcuacionSegundoGrado {

    private Integer a;
    private Integer b;
    private Integer c;
    private Double raiz1;
    private Double raiz2;

    public EcuacionSegundoGrado(Integer a, Integer b, Integer c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public String calcularRaices(){
        String res = "La ecuacion no tiene soluciones Reales.";
        double discriminante = (b * b - 4 * a * c);

        if (discriminante == 0) {
            raiz1 = (-b + sqrt(b * b - 4 * a * c) / (2 * a));
            raiz2 = raiz1;
            res = "x1 = " + raiz1;
        }else if (discriminante > 0){
            raiz1 = (-b + sqrt(b * b - 4 * a * c) / (2 * a));
            raiz2 = (-b - sqrt(b * b - 4 * a * c) / (2 * a));
            res = "x1 = " + raiz1 + "\n" + "x2 = " + raiz2;
        }

        boolean raizNula = ((raiz1 == null) || (raiz2 == null));

        if ( raizNula ||  ((raiz1.isNaN()) || (raiz2.isNaN()))){
            res = "La ecuacion no tiene soluciones Reales.";
        }

        return res;
    }

    public String toString(){
        String res = a + "*x^2";

        if(b >= 0){
            res = res + " + " + b + "*x";
        }else{
            res = res + " - " + Math.abs(b) + "*x";
        }

        if(c >= 0){
            res = res + " + " + c;
        }else{
            res = res  + " - " + Math.abs(c);
        }

        return res;
    }

    public Double calcularY(double x){
        double Y = (a*(x * x)) + (b*x) + c;

        return Y;
    }
}
