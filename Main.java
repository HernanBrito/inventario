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
                
                System.out.print("Ingrese el precio del producto: ");
                double precio = scanner.nextDouble();
                
                System.out.print("Ingrese la cantidad del producto: ");
                int cantidad = scanner.nextInt();
                
                scanner.nextLine(); 
                
                Producto nuevoProducto = new Producto(nombre, precio, cantidad);
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
        System.out.println("3. salir");
        System.out.print("Ingrese su opción: "); 
        opcion = scanner.nextInt();

        if (opcion == 1) { 
            inventario.calcularValorInventario(); 
        } else if (opcion == 2) {
            System.out.println("\nProductos en el inventario:");
            inventario.listarProductos();
        }else if (opcion != 3) {

             System.out.println("Opción no válida, por favor intente de nuevo."); 

            }
        }
            while(opcion != 3);
            scanner.close(); 
        }
    }

