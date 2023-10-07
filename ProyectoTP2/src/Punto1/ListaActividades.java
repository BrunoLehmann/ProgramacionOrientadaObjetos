package Punto1;

import java.util.LinkedList;

public class ListaActividades {
    private LinkedList<Actividad> actividades = new LinkedList<Actividad>();

    public void agregarActividad(String descripcion, Integer permiso){
        Actividad act = new Actividad(descripcion.toLowerCase(), permiso);
        actividades.add(act);
    }

    public String toString() {
        String res = "";
        for(int i = 0; i < actividades.size(); i++) {
            Actividad aux = actividades.get(i);
            res = res + aux.toString() + "\n";
        }
        return res;
    }

    private Integer tipoSubscripciontoInteger(String tipoSubscripcion) {
        Integer res = 0;
        if (tipoSubscripcion.equals("basica")) {
            res = 1;
        } else if (tipoSubscripcion.equals("intermedia")) {
            res = 2;
        } else if (tipoSubscripcion.equals("destacada")) {
            res = 3;
        }
        return res;
    }

    public String mostrarActividadesValidas(Integer permiso){
        String res = "Actividades de permiso: " + permiso.toString() + "\n";
        if (permiso > 0 && permiso < 4){
            for(int i = 0; i < actividades.size(); i++) {
                Actividad aux = actividades.get(i);
                if (permiso >= aux.getPermiso()) {
                    res = res + aux.toString() + "\n";
                }
            }
        }
        return res;
    }
}
