public class Producto {
    private String identificador;
    private double precio;

    public Producto(String identificador, double precio) {
        this.identificador = identificador;
        this.precio = precio;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString() {
        return "El producto es " + identificador + " y su precio " + precio + ".";
    }
}
