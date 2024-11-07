public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombreProduct , double precioProduct , int cantidadProduct) {

        nombre = nombreProduct;
        precio = precioProduct;
        cantidad = cantidadProduct;

    }

    public void setPrecio(Double precioProducto){
        precio = precioProducto;
    }

    public double getPrecio(){
        return precio;
    } 

    public int getCantidad(){
        return cantidad;
    }

    public String getNombre(){
        return nombre;
    }

}
