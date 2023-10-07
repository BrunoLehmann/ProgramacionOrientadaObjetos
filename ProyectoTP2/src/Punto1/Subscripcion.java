package Punto1;

import java.util.LinkedList;

public class Subscripcion {
    private String tipoSubscripcion;
    private Integer monto = 0;
    private static ListaActividades actividadesValidas;


    public Subscripcion(String tipoSubscripcion, Integer monto){
        this.tipoSubscripcion = tipoSubscripcion.toLowerCase();
        this.monto = monto;
    }

    public Subscripcion(String tipoSubscripcion, Integer monto, ListaActividades actividades){
        this(tipoSubscripcion, monto);
        this.actividadesValidas = actividades;
    }

    public String mostrarActividadesValidas(){
        String res = "";
        if(tipoSubscripcion.equals("basica")){
            res = actividadesValidas.mostrarActividadesValidas(1);
        }else if (tipoSubscripcion.equals("intermedia")){
            res = actividadesValidas.mostrarActividadesValidas(2);
        }else if (tipoSubscripcion.equals("destacada")){
            res = actividadesValidas.mostrarActividadesValidas(3);
        }

        return res;
    }

    public String getTipoSubscripcion() {
        return tipoSubscripcion;
    }
}
