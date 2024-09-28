package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a tu Biblioteca favorita");
        // Se crea la Biblioteca
        Biblioteca biblioteca = new Biblioteca("A leer", 0, null, null, null, null);

        // Se crean los Bibliotecarios
        Bibliotecario bibliotecario1 = new Bibliotecario("Yiceli", "3226022573", "yicelli@gmail.com", "1094917419", 1300000.0, 2020-01-01, ); 
        
        // Se crean los Estudiantes
        Estudiante estudiante1 = new Estudiante("joan", "3148189096", "joans@gmail.com", "1094917417");
            //se crean las personas

        // Se agregan los bibliotecarios a la  biblioteca
        biblioteca.agregarBibliotecario(bibliotecario1);

        // Se agregan los estudiantes a la biblioteca
        biblioteca.agregarEstudiante(estudiante1);

        System.out.println(biblioteca);

    }
}