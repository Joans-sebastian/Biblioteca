package co.edu.uniquindio.poo;

import java.util.Collection;

public class Biblioteca {

    private String nombre;
    private double totalDineroRecaudo;
    private Collection<Bibliotecario> bibliotecarios;
    private Collection<Prestamo> prestamos;
    private Collection<Libro> libros;
    private Collection<Estudiante> estudiantes;

    public Biblioteca(String nombre, double totalDineroRecaudo, Collection<Bibliotecario> bibliotecarios,
            Collection<Prestamo> prestamos, Collection<Libro> libros, Collection<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.totalDineroRecaudo = totalDineroRecaudo;
        this.bibliotecarios = bibliotecarios;
        this.prestamos = prestamos;
        this.libros = libros;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotalDineroRecaudo() {
        return totalDineroRecaudo;
    }

    public void setTotalDineroRecaudo(double totalDineroRecaudo) {
        this.totalDineroRecaudo = totalDineroRecaudo;
    }

    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Collection<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", totalDineroRecaudo=" + totalDineroRecaudo + ", bibliotecarios="
                + bibliotecarios + ", prestamos=" + prestamos + ", libros=" + libros + ", estudiantes=" + estudiantes
                + "]";
    }

    public boolean verificarBibliotecario(String nombre) {
        boolean centinela = false;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        if (!verificarBibliotecario(bibliotecario.getNombre())) {
            bibliotecario.add(bibliotecario);
        }
    }

    public void eliminarBibliotecario(String nombre) {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getNombre().equals(nombre)) {
                bibliotecario.remove(bibliotecario);
                break;

            }
        }
    }

    public boolean verificarEstudiante(String nombre) {
        boolean centinela = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarEstudiantes(Estudiante estudiantes) {
        if (!verificarEstudiante(estudiantes.getNombre())) {
            estudiantes.add(estudiantes);
        }
    }

    public void eliminarEstudiante(String nombre) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombre)) {
                estudiante.remove(estudiante);
                break;

            }
        }
    }

    public boolean verificarLibro(String titulo) {
        boolean centinela = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarLibro(Libro libros) {
        if (!verificarLibro(libros.getTitulo())) {
            libros.add(libros);
        }
    }

    public void eliminarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.remove(libro);
                break;

            }
        }
    }

    public int contarLibros(Libro libros) {
        int contador = 0;
        for (int i = 0; i >= 0; i++) {
            if (libros.getTitulo() == libros.getTitulo()) {
                contador++;
            }
        }
        return contador;
    }

    public double sumaTotal(int contador) {
        double acumulador = 0;
        for (int j = 0; j >= 0; j++) {
            if (contador > 0 && acumulador > 0) {
                acumulador = acumulador * contador;
            }

        }
        return acumulador;
    }
}
