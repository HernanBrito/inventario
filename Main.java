import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        String continuar;
        String continuarProducto;
        
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
        System.out.println("5. Salir");
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
            inventario.buscarProducto(productoABuscar);
        }else if(opcion == 4){
            System.out.println("Que producto desea eliminar?");
            String productoAEliminar = scanner.nextLine();
            if(inventario.elminarProducto(productoAEliminar)){
                System.out.println("El producto" + productoAEliminar + " se a eliminado correctamente");
            }else{
                System.out.println("El producto que desea eliminar no se encuentra en el inventario");
            }
        }else if (opcion != 5) {
             System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
            while(opcion != 5);
            scanner.close(); 
        }
    }

