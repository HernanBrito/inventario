
import java.util.ArrayList;

public class Inventario {

    ArrayList<Producto> listaDeProductos = new ArrayList<>();
    double valorInventario = 0;


    public void calcularValorInventario(){
        for (Producto producto : listaDeProductos) {
            valorInventario += producto.getPrecio() * producto.getCantidad();
        }
        System.out.println(valorInventario);
    }


    public void listarProductos(){

        for (Producto producto : listaDeProductos) {
            System.out.println("Nombre de producto : " + producto.getNombre() + "Precio: " + producto.getPrecio() + " Cantidad: " + producto.getCantidad());
        }

    }

    public void agregarProducto(Producto producto){
        listaDeProductos.add(producto);
    }

}
