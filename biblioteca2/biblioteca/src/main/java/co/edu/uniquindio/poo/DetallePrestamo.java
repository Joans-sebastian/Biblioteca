package co.edu.uniquindio.poo;

/*
 * Clase que lleva el detalle de los prestamos junto a su costo y el porcentaje que se cobra por tiempo
 */
public class DetallePrestamo {

    public int cantidad;
    public Prestamo prestamo;
    public Libro libro;
    public double subTotal;

    public DetallePrestamo(int cantidad, Prestamo prestamo, Libro libro) {
        this.cantidad = cantidad;
        this.prestamo = prestamo;
        this.libro = libro;
        //this.subTotal=calcularSubtotal();
    }

    /*public double calcularSubtotal(){
        return cantidad*libro.get
    }*/
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "DetallePrestamo [cantidad=" + cantidad + ", prestamo=" + prestamo + ", libro=" + libro + ", subTotal="
                + subTotal + "]";
    }

}
