package Punto1;

import java.util.Comparator;
import java.util.LinkedList;

public class ListaSocios {
    private LinkedList<Socio> socios;

    public ListaSocios(){
        socios = new LinkedList<Socio>();
    }

    public void agregarSocio(String nombre, String email, String direccion, Subscripcion subscripcion){
        Socio nuevoSocio = new Socio(nombre, email, direccion, subscripcion);
        socios.add(nuevoSocio);
    }


    private Integer tipoSubscripciontoInteger(String tipoSubscripcion){
        Integer res = 0;
        if(tipoSubscripcion.equals("basica")){
            res = 1;
        }else if(tipoSubscripcion.equals("intermedia")){
            res = 2;
        }else if(tipoSubscripcion.equals("destacada")){
            res = 3;
        }

        return res;
    }

    public void ordenar() {
        socios.sort(new Comparator<Socio>() {
            @Override
            public int compare(Socio o1, Socio o2) {
                int res = 0;
                if(tipoSubscripciontoInteger(o1.getSubs().getTipoSubscripcion()) > tipoSubscripciontoInteger(o2.getSubs().getTipoSubscripcion())){
                    res = 1;
                }else if (tipoSubscripciontoInteger(o1.getSubs().getTipoSubscripcion()) < tipoSubscripciontoInteger(o2.getSubs().getTipoSubscripcion())){
                    res = -1;
                }
                return res;
            }
        });


    }


}
