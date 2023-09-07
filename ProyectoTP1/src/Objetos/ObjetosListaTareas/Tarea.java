package Objetos.ObjetosListaTareas;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarea {
    private String descripcion;
    private Estado estado = Estado.INCOMPLETA;
    private Boolean vencida = false;
    private Integer prioridad;
    private LocalDate fechaLimite;

    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu");

    public Tarea(String descripcion){
        this.descripcion = descripcion;
    }

    public Tarea(String descripcion, String fechaLimite){
        this(descripcion);
        this.fechaLimite = LocalDate.parse(fechaLimite, formato);
    }

    public Tarea(String descripcion, String fechaLimite, Estado estado){
        this(descripcion, fechaLimite);
        this.estado = estado;
    }

    public void modificarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void modificarPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public void terminarTarea(){
        estado = Estado.COMPLETA;
    }

    public String mostrarTarea(){
        String res = this.descripcion;
        if(estado == Estado.COMPLETA){
            res = "(Vencida) " + this.descripcion;
        }
        return res;
    }

    public Boolean estaVencida(){
        return vencida;
    }

    public Boolean estaCompleta(){
        return estado == Estado.COMPLETA;
    }

}
