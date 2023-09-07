package Objetos.ObjetosListaTareas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Tarea {
    private String descripcion;
    private Estado estado = Estado.INCOMPLETA;
    private Boolean vencida = false;
    private Integer prioridad = 1;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;
    private LocalDate fechaFinalizacion = null;

    private String colaborador;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Tarea(String descripcion){
        this.descripcion = descripcion;
        colaborador = "";
    }

    public Tarea(String descripcion, String fechaLimite){
        this(descripcion);
        this.fechaLimite = LocalDate.parse(fechaLimite, formatter);
    }

    public Tarea(String descripcion, String fechaLimite, Integer prioridad){
        this(descripcion, fechaLimite);
        this.fechaLimite = LocalDate.parse(fechaLimite, formatter);
        this.prioridad = prioridad;
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
        this(descripcion, fechaLimite, fechaRecordatorio);
        this.estado = estado;
        this.fechaRecordatorio = LocalDate.parse(fechaRecordatorio, formatter);
    }

    public Tarea(String descripcion, String fechaLimite, String fechaRecordatorio, Estado estado, Integer prioridad){
        this(descripcion, fechaLimite, estado);
        this.estado = estado;
        this.prioridad = prioridad;
        this.fechaRecordatorio = LocalDate.parse(fechaRecordatorio, formatter);

    }

    public Tarea(String descripcion, String fechaLimite, String fechaRecordatorio, Integer prioridad){
        this(descripcion, fechaLimite, prioridad);
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

    public void terminarTarea(String fechaFinalizacion, String colaborador){
        colaborador = colaborador.toLowerCase();
        this.colaborador = colaborador;
        this.fechaFinalizacion = LocalDate.parse(fechaFinalizacion, formatter);
        estado = Estado.COMPLETA;

    }



    public String mostrarTarea(){
        String res = this.descripcion;

        if((estado == Estado.COMPLETA) || (estaVencida())){
            res = "(Vencida) " + this.descripcion;
        }else {
            if (fechaRecordatorio != null) {
                LocalDate fechaActual = LocalDate.now();
                if ((fechaRecordatorio.compareTo(fechaActual) > 0)) {
                    res = "(Por Vencer)" + this.descripcion;
                } else if (fechaActual.isAfter(fechaRecordatorio) || fechaRecordatorio.isEqual(fechaActual)) {
                    prioridad = 10;
                    res = "(Por Vencer)" + this.descripcion;
                }
            }
        }
        return "| Descripcion: " + res + "| Fecha limite: " + fechaLimite.format(formatter) + "| Prioridad: " + prioridad;
    }

    public Boolean estaVencida(){
        LocalDate fechaActual = LocalDate.now();
        if(fechaActual.isAfter(fechaLimite)){
            vencida = true;
        }
        return vencida;
    }

    public Boolean estaCompleta(){
        return estado == Estado.COMPLETA;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public String getColaborador() {
        return colaborador;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }
}
