package co.edu.uniquindio.poo;

/*
 * Clase que lleva el detalle de los prestamos junto a su costo y el porcentaje que se cobra por tiempo
 */
public class DetallePrestamo {

    public int cantidad;
    public Prestamo prestamo;
    public Libro libro;
    public double subTotal, valorPrestamo;

    public DetallePrestamo(int cantidad, Prestamo prestamo, Libro libro, double subTotal, double valorPrestamo) {
        this.cantidad = cantidad;
        this.prestamo = prestamo;
        this.libro = libro;
        this.subTotal = subTotal;
        this.valorPrestamo = valorPrestamo;
    }

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

    public double getValorPrestamo() {
        return valorPrestamo;
    }

    public void setValorPrestamo(double valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }

    @Override
    public String toString() {
        return "DetallePrestamo [cantidad=" + cantidad + ", prestamo=" + prestamo + ", libro=" + libro + ", subTotal="
                + subTotal + ", valorPrestamo=" + valorPrestamo + "]";
    }

}
