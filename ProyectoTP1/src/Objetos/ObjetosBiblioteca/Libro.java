package Objetos.ObjetosBiblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private Integer cantPaginas;
    private Integer cantEjemplares;
    private Integer ejemPrestados;

    private static Integer librosPrestadosTotales = 0;


    public Libro(String titulo, String autor, Integer cantPaginas, Integer cantEjemplares){
        this.titulo = titulo;
        this.autor = autor;
        setCantPaginas(cantPaginas);
        setCantEjemplares(cantEjemplares);
        this.isbn = "Desconocido";
        this.ejemPrestados = 0;
    }

    public Libro(String titulo, String autor, String isbn, Integer cantPaginas, Integer cantEjemplares){
        this(titulo, autor,cantPaginas, cantEjemplares);
        this.isbn = isbn;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCantEjemplares(Integer cantEjemplares) {
        if (cantEjemplares >= 0){
            this.cantEjemplares = cantEjemplares;
        }
    }

    public void setCantPaginas(Integer cantPaginas) {
        if (cantPaginas >= 0) {
            this.cantPaginas = cantPaginas;
        }
    }

    public String toString(){
        return "El libro " + titulo + " creado por " + autor + " tiene " + cantPaginas + " paginas, quedan " + cantEjemplares + " disponibles y se prestaron " + ejemPrestados + ".";
    }

    public Boolean prestarLibro(){
        Boolean res = false;
        if (cantEjemplares > 1){
            cantEjemplares = cantEjemplares - 1;
            ejemPrestados = ejemPrestados + 1;
            librosPrestadosTotales = librosPrestadosTotales + 1;
            res = true;
        }
        return res;
    }

    public String compararPaginas(Libro libro) {
        String res = "El libro con mas paginas es ";

        if (this.cantPaginas > libro.cantPaginas) {
            res = res + this.titulo;
        } else if (this.cantPaginas < libro.cantPaginas) {
            res = res + libro.titulo;
        } else {
            res = "Los libros tienen la misma cantidad de paginas.";
        }

        return res;
    }

    public Integer getLibrosPrestadosTotales(){
        return librosPrestadosTotales;
    }
}
