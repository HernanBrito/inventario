
import java.util.ArrayList;
import java.util.Collections;

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
                System.out.println("Nombre de producto : " + producto.getNombre() + ", Categoria : " + producto.getCategoria() + ", Precio: " + producto.getPrecio() + ", Cantidad: " + producto.getCantidad());
            }
        }else{System.out.println("El inventario se encuentra vacio, no hay elementos por listar");}
    }


    public void agregarProducto(Producto producto){
        listaDeProductos.add(producto);
    }

    public Producto buscarProducto(String nombreProducto) {
        for (int i = 0; i < listaDeProductos.size(); i++) {
            Producto producto = listaDeProductos.get(i);
            if (producto.getNombre().equals(nombreProducto)){
                return producto;                   
            }
        }
        return null;
    }

    public boolean eliminarProducto(String nombreProducto) throws Exception {
        boolean encontrado = false;
            for (int i = 0; i < listaDeProductos.size(); i++) {
                Producto producto = listaDeProductos.get(i);
                if (producto.getNombre().equals(nombreProducto)) {
                    listaDeProductos.remove(i);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                throw new Exception("No se encontro el producto: " + nombreProducto);
            }
        return encontrado;
    }



    public void productosOrdenadosPor(String opcion){
         if(opcion.equals("nombre")){
             Collections.sort(listaDeProductos , 
               (Producto p1 , Producto p2) -> p1.getNombre().compareTo(p2.getNombre())     
            );
        }else if(opcion.equals("precio")){
            Collections.sort(listaDeProductos , 
                (Producto p1 , Producto p2) ->Double.compare(p2.getPrecio(), p1.getPrecio())
         );
        }else if(opcion.equals("cantidad")){
            Collections.sort(listaDeProductos ,
            (Producto p1 , Producto p2) -> Integer.compare(p2.getCantidad(), p1.getCantidad())
            );
            }

//        System.out.println("Lista de productos ordenada por " + opcion + ":");
//            for (Producto producto : listaDeProductos) {
//                System.out.println(producto.getNombre()); //ver como implementarlo en el front
//           }
        }


 }
