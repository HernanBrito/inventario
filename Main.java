import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        String continuar;

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
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nProductos en el inventario:");
        inventario.listarProductos();

        //scanner.close();
        
        int opcion;
        do { 
        System.out.println("\nOpciones:");
        System.out.println("1. Calcular valor del inventario"); 
        System.out.println("2. Salir");
        System.out.print("Ingrese su opción: "); 
        opcion = scanner.nextInt();

        if (opcion == 1) { 
            inventario.calcularValorInventario(); 
        } else if (opcion != 2) {

             System.out.println("Opción no válida, por favor intente de nuevo."); 

            }
        }
            while(opcion != 2);

        
            
             scanner.close(); 
    }
}
