package co.edu.uniquindio.poo;

import java.time.LocalDate;

/*
 * Clase para obtener informacion de un libro
 */
public class Libro {

    private String titulo, editorial;
    private int unidadesDisponibles, codigo, isbn;
    private LocalDate fechaPublicacion;
    private boolean estado;
    public Autor autor;

    public Libro(String titulo, String editorial, int unidadesDisponibles, int codigo, int isbn,
            LocalDate fechaPublicacion, boolean estado, Autor autor) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.unidadesDisponibles = unidadesDisponibles;
        this.codigo = codigo;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.estado = estado;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", editorial=" + editorial + ", unidadesDisponibles=" + unidadesDisponibles
                + ", codigo=" + codigo + ", isbn=" + isbn + ", fechaPublicacion=" + fechaPublicacion + ", estado="
                + estado + ", autor=" + autor + "]";
    }

    public void add(Libro libro) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public void remove(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
