import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        String continuar;
        String continuarProducto;


        System.out.print("¿Desea cargar productos desde un archivo? (s/n): ");
        String cargarDesdeArchivo = scanner.nextLine();

        if (cargarDesdeArchivo.equalsIgnoreCase("s")) {
            System.out.print("Ingrese el nombre del archivo (con extensión): ");
            String nombreArchivo = scanner.nextLine();

            try (BufferedReader breader = new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
                while ((linea = breader.readLine()) != null) {
                    String[] datos = linea.split(",");
                    
                    if (datos.length == 4) { // Asegurarse de que haya 4 campos
                        String nombre = datos[0].trim();
                        String categoria = datos[1].trim();
                        double precio = Double.parseDouble(datos[2].trim());
                        int cantidad = Integer.parseInt(datos[3].trim());
                        
                        Producto nuevoProducto = new Producto(nombre, categoria, precio, cantidad);
                        inventario.agregarProducto(nuevoProducto);
                    } else {
                        System.out.println("Línea con formato incorrecto: " + linea);
                    }
                }
                System.out.println("Productos cargados exitosamente.");
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        }

        //
        //
        
        System.out.println("Desea agregar algun producto al inventario? (s/n): ");
        continuar = scanner.nextLine();
            

        if (continuar.equalsIgnoreCase("s")) {
            do {
                System.out.print("Ingrese el nombre del producto: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la categoria del producto: ");
                String categoria = scanner.nextLine();
                
                System.out.print("Ingrese el precio del producto: ");
                double precio = scanner.nextDouble();
                
                System.out.print("Ingrese la cantidad del producto: ");
                int cantidad = scanner.nextInt();
                
                scanner.nextLine(); 
                
                Producto nuevoProducto = new Producto(nombre, categoria , precio, cantidad);
                inventario.agregarProducto(nuevoProducto);
                
                System.out.print("¿Desea agregar otro producto? (s/n): ");
                continuarProducto = scanner.nextLine();
                
            } while (continuarProducto.equalsIgnoreCase("s"));
        }
        
        //scanner.close();
        
        int opcion;
        do { 
        System.out.println("\nOpciones:");
        System.out.println("1. Calcular valor del inventario"); 
        System.out.println("2. Listar productos");
        System.out.println("3. Buscar Producto");
        System.out.println("4. Eliminar un producto");
        System.out.println("5. Ordenar productos");
        System.out.println("6. Salir");
        System.out.print("Ingrese su opción: "); 
        opcion = scanner.nextInt();
        

        scanner.nextLine(); // se vuelve a llamar al escaner
        if (opcion == 1) { 
            inventario.calcularValorInventario();
            System.out.println("El valor del inventario es: "+inventario.valorInventario); 
        } else if (opcion == 2) {
            System.out.println("\nProductos en el inventario:");
            inventario.listarProductos();
        }else if(opcion == 3) {
            System.out.println("Que producto desea buscar?");
            String productoABuscar = scanner.nextLine();
            Producto producto = inventario.buscarProducto(productoABuscar);
            if(!(producto == null)){
                caracteristicasProducto(producto);
            }else{System.out.println("No existe ese producto en el inventario");}
        }else if(opcion == 4){
            System.out.println("Que producto desea eliminar?");
            String productoAEliminar = scanner.nextLine();
            try{if(inventario.eliminarProducto(productoAEliminar)){
                System.out.println("El producto " + productoAEliminar + " se a eliminado correctamente");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        }else if (opcion == 5) {
            System.out.println("Como quiere ordenar los productos?");
            System.out.println("precio, nombre, categoria");
            String ordenarPor = scanner.nextLine();
            inventario.productosOrdenadosPor(ordenarPor);
            inventario.listarProductos();
        }
        else if (opcion != 6) {
             System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
            while(opcion != 6);
            scanner.close(); 
        }

        public static void caracteristicasProducto(Producto producto) {
            System.out.println("Nombre de producto: " + producto.getNombre() +
                               ", Categoría: " + producto.getCategoria() +
                               ", Precio: " + producto.getPrecio() +
                               ", Cantidad: " + producto.getCantidad());
        }



    }

