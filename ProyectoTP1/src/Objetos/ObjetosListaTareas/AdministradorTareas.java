package Objetos.ObjetosListaTareas;

import Objetos.ObjetosListaTareas.Tarea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class AdministradorTareas {
    private LinkedList<Tarea> tareas;
    private LinkedList<String> colaboradores;


    public AdministradorTareas(){
        tareas = new LinkedList<Tarea>();
        colaboradores = new LinkedList<String>();
    }

    public void agregarTarea(String descripcion, String fechaLimite, String fechaRecordatorio, Estado estado, Integer prioridad){
        Tarea tarea = new Tarea(descripcion, fechaLimite, fechaLimite, estado, prioridad);
        tareas.add(tarea);
    }

    public void agregarTarea(String descripcion, String fechaLimite, String fechaRecordatorio){
        Tarea tarea = new Tarea(descripcion, fechaLimite, fechaLimite);
        tareas.add(tarea);
    }

    public void agregarTarea(String descripcion, String fechaLimite, Integer prioridad){
        Tarea tarea = new Tarea(descripcion, fechaLimite, prioridad);
        tareas.add(tarea);
    }

    public void agregarTarea(String descripcion, String fechaLimite, String fechaRecordatorio, Integer prioridad){
        Tarea tarea = new Tarea(descripcion, fechaLimite, fechaLimite, prioridad);
        tareas.add(tarea);
    }

    private Integer compareFecha(LocalDate fecha1, LocalDate fecha2){
        //Este metodo retorna 1 si fecha1 > fecha2 para sumar a la clave del ordenamiento
        //este metodo se utiliza unicamente para combinar claves en el algoritmo de ordenamiento
        Integer res = 0;
        Integer valor = fecha1.compareTo(fecha2);
        if(valor > 0){
            res = 1;
        }

        return res;
    }

    public void ordenarTareas(){
        String res = "";
        int index = 0;
        Tarea tarea;
        Tarea tareaSig;
        boolean centinela = true;


        if(tareas.size() > 1) {
            while (centinela) {
                centinela = false;
                index = 0;
                while (index < tareas.size() - 1) {
                    tarea = tareas.get(index);
                    tareaSig = tareas.get(index + 1);
                    Integer clave1 = tarea.getPrioridad() + compareFecha(tarea.getFechaLimite(), tareaSig.getFechaLimite()); //la comparacion de fechas da negativo si es anterior
                    Integer clave2 = tareaSig.getPrioridad() + compareFecha(tareaSig.getFechaLimite(), tarea.getFechaLimite()); // positivo si es posterior
                    if (clave1 < clave2) {
                        tareas.set(index, tareaSig);
                        tareas.set(index + 1, tarea);
                        centinela = true;
                    }
                    index = index + 1;
                }

                }
            }
        }


    public String mostrarTareas(){
        int index = 0;
        Tarea tarea;
        String res = "";

        while(index < tareas.size()){
            tarea = tareas.get(index);
            res = res + tarea.mostrarTarea() + " \n";
            index = index + 1;
        }

        return res;
    }

    public Integer buscarTarea(String descripcion){
        int index = 0;
        int posicion = -1;
        Tarea tarea;
        String res = "";
        boolean encontrada = false;
        while((!encontrada) && (index < tareas.size())){
            tarea = tareas.get(index);
            if (tarea.getDescripcion().equals(descripcion)){
                encontrada = true;
                posicion = index;
            }
            index = index + 1;
        }
        return posicion;
    }

    public void marcarTareaRealizada(String descripcion, String fechaFinalizacion, String colaborador){
        int posicion = 0;
        posicion = buscarTarea(descripcion);
        Tarea tarea;
        colaborador = colaborador.toLowerCase();
        if (posicion != -1){
            tarea = tareas.get(posicion);
            tarea.terminarTarea(fechaFinalizacion, (colaborador));
            tareas.set(posicion, tarea);
        }
    }

    public void agregarColaborador(String nombre){
        colaboradores.add(nombre.toLowerCase());
    }

    public Boolean colaboradorExiste(String colaborador){
        Boolean res = false;
        int index;
        colaborador = colaborador.toLowerCase();
        for (Object colab : colaboradores){
            if(colab.equals(colaborador)){
                res = true;
            }
        }
        return res;
    }

    public String tareasRealizadasPorColaborador(String colaborador){
        colaborador = colaborador.toLowerCase();
        String res = "";
        Tarea tarea;
        for (int index = 0; index < tareas.size(); index++){
            tarea = tareas.get(index);
            if (tarea.getColaborador().equals(colaborador)){
                res = res + tarea.mostrarTarea() +  "| Fecha finalizacion : " + tarea.getFechaFinalizacion() + "\n";
            }
        }
        return res;
    }










}
