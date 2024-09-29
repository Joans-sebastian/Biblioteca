package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Crear listas de objetos
        List<Bibliotecario> bibliotecarios = new ArrayList<>();
        List<Prestamo> prestamos = new ArrayList<>();
        List<Libro> libros = new ArrayList<>();
        List<Estudiante> estudiantes = new ArrayList<>();
        List<DetallePrestamo> detallePrestamos = new ArrayList<>();

        // Crear una Biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", 100000.0, bibliotecarios, prestamos, libros, estudiantes, detallePrestamos);

        // Imprimir el nombre de la biblioteca (ejemplo de uso)
        System.out.println("Nombre de la Biblioteca: " + biblioteca.getNombre());

         // Crear un bibliotecario y agregarlo a la lista
         Bibliotecario bibliotecario1 = new Bibliotecario("brayan", "13579", "brayan@gmail.com", 111111111, 1000000.0,  LocalDate.of(2023, 9, 28));
         bibliotecarios.add(bibliotecario1);
 
         // Crear un estudiante y agregarlo a la lista
         Estudiante estudiante1 = new Estudiante("joan", "2468", "joan@gmail.com", 222222222, false);
         estudiantes.add(estudiante1);
 
         
         // Imprimir información del estudiante
         System.out.println("Estudiante: " + estudiante1.getNombre()); 
         // Asegúrate de tener un método getNombre en Estudiante

         // Imprimir información del bibliotecario
        System.out.println("Bibliotecario: " + bibliotecario1.getNombre()); 
        // Asegúrate de tener un método getFechaContratacion en Bibliotecario

    }
}
