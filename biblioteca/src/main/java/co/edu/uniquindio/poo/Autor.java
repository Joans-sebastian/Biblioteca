package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Autor extends Persona {

    public String apellido, nacionalidad, biografia, sitioWeb, seudonimo;
    public LocalDate fechaNacimiento;
    public LinkedList<Libro> libros;

    public Autor(String nombre, String cedula, String correo, int telefono, String apellido, String nacionalidad,
            String biografia, String sitioWeb, String seudonimo, LocalDate fechaNacimiento, LinkedList<Libro> libros) {
        super(nombre, cedula, correo, telefono);
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;
        this.seudonimo = seudonimo;
        this.fechaNacimiento = fechaNacimiento;
        this.libros = libros;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getSeudonimo() {
        return seudonimo;
    }

    public void setSeudonimo(String seudonimo) {
        this.seudonimo = seudonimo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Autor [apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", biografia=" + biografia
                + ", sitioWeb=" + sitioWeb + ", seudonimo=" + seudonimo + ", fechaNacimiento=" + fechaNacimiento
                + ", libros=" + libros + "]";
    }

}
