package Objetos.ObjetosListaTareas;

import Objetos.ObjetosFecha.Fecha;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarea {
    private String descripcion;
    private Estado estado = Estado.INCOMPLETA;
    private Boolean vencida = false;
    private Integer prioridad = 0;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Tarea(String descripcion){
        this.descripcion = descripcion;
    }

    public Tarea(String descripcion, String fechaLimite){
        this(descripcion);
        this.fechaLimite = LocalDate.parse(fechaLimite, formatter);
    }

    public Tarea(String descripcion, String fechaLimite, Estado estado){
        this(descripcion, fechaLimite);
        this.estado = estado;
    }
    public Tarea(String descripcion, String fechaLimite, String fechaRecordatorio){
        this(descripcion, fechaLimite);
        this.estado = estado;
        this.fechaRecordatorio = LocalDate.parse(fechaRecordatorio, formatter);
    }
    public Tarea(String descripcion, String fechaLimite, String fechaRecordatorio, Estado estado){
        this(descripcion, fechaLimite, estado);
        this.estado = estado;
        this.fechaRecordatorio = LocalDate.parse(fechaRecordatorio, formatter);
    }

    public Integer getPrioridad() {
        return prioridad;
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

        if (fechaRecordatorio != null) {
            LocalDate fechaActual = LocalDate.now();
            if ((fechaRecordatorio.isAfter(fechaActual))) {
                res = "(Por Vencer)" + this.descripcion;
            } else if (fechaActual.isAfter(fechaRecordatorio) || fechaRecordatorio.isEqual(fechaActual)) {
                prioridad = 10;
                res = "(Por Vencer)" + this.descripcion;
            }
        }
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
