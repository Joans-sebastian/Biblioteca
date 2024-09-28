package co.edu.uniquindio.poo;

import java.util.Collection;

public class Biblioteca {

    public String nombre;
    public double totalDineroRecaudo;
    public Collection<Bibliotecario> bibliotecarios;
    public Collection<Prestamo> prestamos;
    public Collection<Libro> libros;
    public Collection<Estudiante> estudiantes;
    public Collection<DetallePrestamo> detallePrestamos;

    public Biblioteca(String nombre, double totalDineroRecaudo, Collection<Bibliotecario> bibliotecarios,
            Collection<Prestamo> prestamos, Collection<Libro> libros, Collection<Estudiante> estudiantes,
            Collection<DetallePrestamo> detallePrestamos) {
        this.nombre = nombre;
        this.totalDineroRecaudo = totalDineroRecaudo;
        this.bibliotecarios = bibliotecarios;
        this.prestamos = prestamos;
        this.libros = libros;
        this.estudiantes = estudiantes;
        this.detallePrestamos = detallePrestamos;
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

    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    public void setDetallePrestamos(Collection<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", totalDineroRecaudo=" + totalDineroRecaudo + ", bibliotecarios="
                + bibliotecarios + ", prestamos=" + prestamos + ", libros=" + libros + ", estudiantes=" + estudiantes
                + ", detallePrestamos=" + detallePrestamos + "]";
    }

    /*
     * metodo para verificar si exite ya un bibliotecario con ese mismo nombre
     */
    public boolean verificarBibliotecario(String nombre) {
        boolean centinela = false;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un nuevo bibliotecario
     */
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        if (!verificarBibliotecario(bibliotecario.getNombre())) {
            bibliotecario.add(bibliotecario);
        }
    }

    /*
     * metodo para eliminar los datos de un bibliotecario en caso de despido
     */
    public void eliminarBibliotecario(String nombre) {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getNombre().equals(nombre)) {
                bibliotecario.remove(bibliotecario);
                break;

            }
        }
    }

    /*
     * metodo para verificar si el estudiante esta dentro de la base de datos
     */
    public boolean verificarEstudiante(String nombre) {
        boolean centinela = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * metodo para agregar un estudiante nuevo si solicita algun libro prestado
     */
    public void agregarEstudiantes(Estudiante estudiantes) {
        if (!verificarEstudiante(estudiantes.getNombre())) {
            estudiantes.add(estudiantes);
        }
    }

    /*
     * metodo para eliminar datos de un estudiante
     */
    public void eliminarEstudiante(String nombre) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombre)) {
                estudiante.remove(estudiante);
                break;

            }
        }
    }

    /*
     * metodo para verificar si algun libro ya exite
     */
    public boolean verificarLibro(String titulo) {
        boolean centinela = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * metodo para agregar un libro
     */
    public void agregarLibro(Libro libros) {
        if (!verificarLibro(libros.getTitulo())) {
            libros.add(libros);
        }
    }

    /*
     * metodo para elimiar algun libro en especifico
     */
    public void eliminarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.remove(libro);
                break;

            }
        }
    }

    /*
     * metodo para contar los libros con el mismo nombre
     */
    public int contarLibros(Libro libro) {
        int contador = 0;
        for (int i = 0; i >= 0; i++) {
            if (libro.getTitulo() == libro.getTitulo()) {
                contador++;

            }
        }
        return contador;
    }

    /*
     * metodo para calcular el acumulado con el contador
     */
    public double sumaLibros(int contador) {
        double acumulador = 0;
        for (int j = 0; j >= 0; j++) {
            if (contador > 0 && acumulador > 0) {
                acumulador = acumulador * contador;
            }

        }
        return acumulador;
    }

    /*
     * metodo para consultar libros por codigo
     */
    public boolean consultarLibroPorCodigo(int codigo) {
        boolean centinela = false;
        for (Libro libro : libros) {
            if (libro.getCodigo() == codigo) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * metodo para calcular la suma de todos los prestamos
     */
    public double calcularTotal() {
        double total = 0;
        for (DetallePrestamo detallePrestamo : detallePrestamos) {
            total += detallePrestamo.getSubTotal();
        }
        return total;
    }
}
