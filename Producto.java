public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private String categoria;

    public Producto(String nombreProduct ,String categoriaProducto , double precioProduct , int cantidadProduct) {

        nombre = nombreProduct;
        precio = precioProduct;
        cantidad = cantidadProduct;
        categoria = categoriaProducto;

    }

    public String getCategoria(){
        return categoria;
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
