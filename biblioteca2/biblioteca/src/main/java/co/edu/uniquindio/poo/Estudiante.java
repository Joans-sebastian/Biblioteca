package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
/*
 * Clase para obtener informacion del estudiante que va a realizar el prestamo de un libro
 */
public class Estudiante extends Persona {

    private boolean estado;
    private Collection<Prestamo> prestamos;

    public Estudiante(String nombre, String cedula, String correo, int telefono, boolean estado) {
        super(nombre, cedula, correo, telefono);
        this.estado = estado;
        prestamos = new LinkedList<>();
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Estudiante [estado=" + estado + ", prestamos=" + prestamos + "]";
    }

    public void add(Estudiante estudiante) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}
