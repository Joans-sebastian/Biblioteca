package co.edu.uniquindio.poo;

/*
 * Clase padre que hereda a las clases bibliotecario y estudiante
 */
public class Persona {

    public String nombre, cedula, correo;
    public int telefono;

    public Persona(String nombre, String cedula, String correo, int telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", telefono=" + telefono
                + "]";
    }

}
