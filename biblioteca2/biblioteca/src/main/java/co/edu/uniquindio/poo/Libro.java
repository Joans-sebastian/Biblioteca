package co.edu.uniquindio.poo;

import java.time.LocalDate;

/*
 * Clase para obtener informacion de un libro
 */
public class Libro {

    private String autor, titulo, editorial;
    private int unidadesDisponibles, codigo, isbn;
    private LocalDate fechaPublicacion;
    private boolean estado;

    public Libro(int codigo, int isbn, String autor, String titulo, String editorial, int unidadesDisponibles, LocalDate fechaPublicacion) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.titulo = titulo;
        this.unidadesDisponibles = unidadesDisponibles;
        this.fechaPublicacion = fechaPublicacion;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
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

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", editorial="
                + editorial + ", unidadesDisponibles=" + unidadesDisponibles + ", fechaPublicacion=" + fechaPublicacion
                + ", estado=" + estado + "]";
    }

    public void add(Libro libro) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}
