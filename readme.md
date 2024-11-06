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