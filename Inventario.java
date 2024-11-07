
import java.util.ArrayList;

public class Inventario {

    ArrayList<Producto> listaDeProductos = new ArrayList<>();
    double valorInventario = 0;


    public void calcularValorInventario(){
        
            for (Producto producto : listaDeProductos) {
                valorInventario += producto.getPrecio() * producto.getCantidad();
            }
    }


    public void listarProductos(){
        if(!listaDeProductos.isEmpty()){
            for (Producto producto : listaDeProductos) {
                System.out.println("Nombre de producto : " + producto.getNombre() + " Precio: " + producto.getPrecio() + " Cantidad: " + producto.getCantidad());
            }
        }else{System.out.println("El inventario se encuentra vacio, no hay elementos por listar");}
        }

    public void agregarProducto(Producto producto){
        listaDeProductos.add(producto);
    }

}
