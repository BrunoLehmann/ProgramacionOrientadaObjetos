package Objetos.ObjetosFecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private String descripcion;
    private String formato;
    private static String[] formatosValidos = {"dd-MM-yyyy", "MM-dd-yyyy"};


    public Fecha(String fecha, String format) {
        this.descripcion = "FormatoInvalido";
        for (String i : formatosValidos) {
            if (format == i) {
                this.descripcion = fecha;
                this.formato = i;
            }
        }
    }

    public Boolean estaEntre(Fecha anterior, Fecha siguiente) {
        Boolean res = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(this.formato);
        LocalDate FechaAnterior = LocalDate.parse(anterior.descripcion, formatter);
        LocalDate FechaSiguiente = LocalDate.parse(siguiente.descripcion, formatter);
        LocalDate FechaActual = LocalDate.parse(descripcion, formatter);

        if ((FechaSiguiente.isAfter(FechaActual)) && (FechaAnterior.isBefore(FechaActual))) {
            res = true;
        }
        return res;
    }

    public String getFecha() {
        return descripcion;
    }

    public Boolean mayorA(Fecha a) {
        LocalDate FechaAnterior = LocalDate.parse(a.descripcion, DateTimeFormatter.ofPattern(this.formato));
        LocalDate FechaActual = LocalDate.parse(this.descripcion, DateTimeFormatter.ofPattern(this.formato));

        return FechaActual.isAfter(FechaAnterior);
    }

    public Boolean menorA(Fecha a) {
        LocalDate FechaMayor = LocalDate.parse(a.descripcion, DateTimeFormatter.ofPattern(this.formato));
        LocalDate FechaActual = LocalDate.parse(this.descripcion, DateTimeFormatter.ofPattern(this.formato));

        return FechaActual.isBefore(FechaMayor);
    }

}

