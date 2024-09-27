package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

/*
 * Clase para crear condiciones en el prestamo de un libro
 */
public class Prestamo {

    public String codigo;
    public LocalDate fechaPrestamo, fechaEntrega;
    public double total;
    public Bibliotecario bibliotecario;
    public Estudiante estudiante;
    public ArrayList<DetallePrestamo> detallePrestamos;

    public Prestamo(String codigo, LocalDate fechaPrestamo, LocalDate fechaEntrega, double total,
            Bibliotecario bibliotecario, Estudiante estudiante, ArrayList<DetallePrestamo> detallePrestamos) {
        this.codigo = codigo;
        this.fechaEntrega = fechaEntrega;
        this.fechaPrestamo = fechaPrestamo;
        this.total = total;
        this.bibliotecario = bibliotecario;
        this.estudiante = estudiante;
        detallePrestamos = new ArrayList<DetallePrestamo>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    public void setDetallePrestamos(ArrayList<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    @Override
    public String toString() {
        return "Prestamo [codigo=" + codigo + ", fechaPrestamo=" + fechaPrestamo + ", fechaEntrega=" + fechaEntrega
                + ", total=" + total + ", bibliotecario=" + bibliotecario + ", estudiante=" + estudiante
                + ", detallePrestamos=" + detallePrestamos + "]";
    }

}
