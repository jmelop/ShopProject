import java.util.Arrays;

public class Tienda {
    public ProductoInventariado[] arr;
    public String nombre;
    public static int MAX = 10;
    public int ultimaEntrada;
    public double caja;

    public Tienda(String nombre, double caja) {
        this.nombre = nombre;
        this.caja = caja;
        ultimaEntrada = 0;
        this.arr = new ProductoInventariado[MAX];
    }

    public int buscarProducto(String id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getIdentificador().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void addProducto(String id, double precio, int cantidad, int beneficio) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getIdentificador().equals(id)) {
                arr[i].setPrecio(precio);
                arr[i].setCantidad(cantidad);
                arr[i].setBeneficio(beneficio);
                break;
            }
        }
        if (arr.length <= MAX && (precio * cantidad) <= caja) {
            arr[ultimaEntrada] = new ProductoInventariado(cantidad, beneficio, id, precio);
            ultimaEntrada++;
        } else if (arr.length > MAX) {
            System.out.println("Error, ya no se dispone de más espacio en la tienda");
        } else if ((precio * cantidad) > caja) {
            System.out.println("Error, no se dispone de suficiente dinero");
        }
    }

    public void venderProducto(String id, int cantidad) {
        for (ProductoInventariado arr : arr) {
            if (arr.getIdentificador().equals(id) && cantidad <= arr.getCantidad()) {
                arr.setCantidad(arr.getCantidad() - cantidad);
            } else {
                System.out.println("El producto no existe o no se dispone de la cantidad requerida");
            }
        }
    }

    public String toString() {
        return "El nombre de la tienda es " + nombre + " se dispone del siguiente dinero en la caja " + caja + " y los productos de los que se disponen son: " + arr + ".";
    }

    public void listar() {
        System.out.println(Arrays.toString(arr));
    }

}
