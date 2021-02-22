public class ProductoInventariado extends Producto{
    public int cantidad;
    public int beneficio;

    public ProductoInventariado(int cantidad, int beneficio, String identificador, double precio){
        super(identificador, precio);
        this.cantidad = cantidad;
        this.beneficio = beneficio;
    }

    public double calcularPrecioFinal(){
        double precio = super.getPrecio();
        return ((double) beneficio / 100 * precio) + precio;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public int getBeneficio(){
        return this.beneficio;
    }

    public void setBeneficio(int beneficio){
        this.beneficio = beneficio;
    }

    public String toString(){
        return "El producto es "+super.getIdentificador()+" y la cantidad es de "+cantidad+" y el beneficio es de "+beneficio+".";
    }

}
