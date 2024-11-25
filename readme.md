Trabajo Práctico de Introducción a Java
Tema: Aplicación de Inventario de Productos

Objetivo: Crear una aplicación de consola en Java para gestionar un inventario simple de productos. Este programa permite añadir productos, listar productos en el inventario y calcular el valor total del inventario.

Requisitos
Variables y Operadores

Crear variables para almacenar la información de un producto, incluyendo:
Nombre del producto
Cantidad en stock
Precio unitario
Clases y Objetos

Crear una clase Producto que contenga los atributos nombre, cantidad y precio.
Crear una clase Inventario que gestione una lista de productos y tenga métodos para agregar, listar y calcular el valor total del inventario.
Constructores y Métodos

Añadir un constructor en la clase Producto que permita inicializar un producto con nombre, cantidad y precio.
En la clase Inventario, incluir los siguientes métodos:
agregarProducto: Añadir un nuevo producto al inventario.
listarProductos: Mostrar todos los productos en el inventario con su información.
calcularValorInventario: Calcular el valor total del inventario sumando el precio por la cantidad de cada producto.
Estructuras de Control

Usa if-else para verificar si hay productos en el inventario antes de listarlos o calcular el valor total.
Utiliza un for-each para recorrer la lista de productos en el método listarProductos.
Interacción con el Usuario

En la clase Main, crear un menú de opciones que permita al usuario:
Agregar un producto
Listar los productos en el inventario
Calcular el valor total del inventario
Salir

-----------------------------------------------------------------------------------------------------------------

Tema: Ampliación de Aplicación de Inventario de Productos

Objetivo:
Ampliar la aplicación de consola en Java para gestionar un inventario con nuevas funcionalidades avanzadas, utilizando conceptos de programación orientada a objetos y estructuras más complejas.

Nuevas Funcionalidades:
Buscar Producto por Nombre:
Permitir al usuario buscar un producto en el inventario ingresando su nombre. Si existe, mostrar la información del producto; de lo contrario, informar que no se encuentra.

Eliminar Producto:
Añadir una opción para eliminar un producto del inventario por nombre.

Actualizar Cantidad o Precio:
Permitir al usuario actualizar la cantidad en stock o el precio unitario de un producto existente.

Categorías de Productos:
Agregar un atributo de categoría a la clase Producto (por ejemplo, "Electrónicos", "Ropa", "Comida").
Permitir filtrar productos por categoría al listar.

Persistencia de Datos:
Guardar el inventario en un archivo de texto al cerrar la aplicación y cargarlo al iniciarla, utilizando las clases de entrada/salida de Java.

Ordenar Productos:
Añadir una opción para ordenar los productos por nombre, cantidad o precio en forma ascendente o descendente.

Historial de Operaciones:
Implementar un sistema simple que registre las operaciones realizadas (agregar, eliminar, actualizar) y permita consultarlas.

Requisitos Técnicos Ampliados:
1. Variables y Atributos:
Añadir un atributo categoría a la clase Producto.
Incorporar una lista para mantener el historial de operaciones en la clase Inventario.
2. Clases y Objetos:
Ampliar la clase Producto para incluir el atributo categoría.
Ampliar la clase Inventario con métodos para buscar, eliminar, actualizar y ordenar productos.
Crear una clase auxiliar Archivo para manejar la carga y guardado de datos en archivos.
3. Constructores y Métodos:
Actualizar el constructor de la clase Producto para incluir el atributo categoría.
Implementar nuevos métodos en la clase Inventario:
buscarProducto: Busca un producto por su nombre.
eliminarProducto: Elimina un producto por su nombre.
actualizarProducto: Permite modificar la cantidad o el precio de un producto existente.
ordenarProductos: Ordena la lista de productos según un criterio.
registrarOperacion: Añade una entrada al historial de operaciones.
listarHistorial: Muestra el historial de operaciones realizadas.
4. Interacción con el Usuario:
En la clase Main, actualizar el menú para incluir las siguientes opciones adicionales:

Buscar producto por nombre.
Eliminar un producto.
Actualizar cantidad o precio de un producto.
Filtrar productos por categoría.
Ordenar productos (por nombre, cantidad, precio).
Mostrar historial de operaciones.
Guardar y salir.
5. Estructuras de Control:
Utilizar try-catch para manejar errores como intentos de eliminar productos que no existen.
Usar switch-case para mejorar la navegación del menú.
Incorporar la clase Comparator o expresiones lambda para ordenar productos.
