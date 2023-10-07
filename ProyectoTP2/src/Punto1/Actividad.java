package Punto1;

public class Actividad {
    private String descripcion;
    private Integer permiso;

    public Actividad(String descripcion, Integer permiso){
        this.descripcion = descripcion.toLowerCase();
        this.permiso = permiso;
    }

    public String toString(){
        return this.descripcion;
    }

    protected Integer getPermiso() {
        return permiso;
    }
}
