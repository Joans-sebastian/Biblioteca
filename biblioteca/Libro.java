package co.edu.uniquindio.poo;

import java.time.LocalDate;

/*
 * Clase para obtener informacion de un libro
 */
public class Libro {

    public String titulo, editorial;
    public int unidadesDisponibles, codigo, isbn;
    public LocalDate fechaPublicacion;
    public boolean estado;
    public Autor autor;
    public double valorPrestamo;

    public Libro(String titulo, String editorial, int unidadesDisponibles, int codigo, int isbn,
            LocalDate fechaPublicacion, boolean estado, Autor autor, double valorPrestamo) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.unidadesDisponibles = unidadesDisponibles;
        this.codigo = codigo;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.estado = estado;
        this.autor = autor;
        this.valorPrestamo = valorPrestamo;
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

    public double getValorPrestamo() {
        return valorPrestamo;
    }

    public void setValorPrestamo(double valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", editorial=" + editorial + ", unidadesDisponibles=" + unidadesDisponibles
                + ", codigo=" + codigo + ", isbn=" + isbn + ", fechaPublicacion=" + fechaPublicacion + ", estado="
                + estado + ", autor=" + autor + ", valorPrestamo=" + valorPrestamo + "]";
    }

    public void add(Libro libro) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public void remove(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
