package Punto1;

public class Socio {
    private String nombre;
    private String email;
    private String direccion;
    private Subscripcion subs;


    public Socio(String nombre, String email, String direccion, Subscripcion subscripcion){
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.subs = subscripcion;
    }

    public Subscripcion getSubs(){
        return subs;
    }


    public void cambiarSubscripcion(Subscripcion subscripcion){
        this.subs = subscripcion;
    }

}
