import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventario inv = new Inventario();

        // Carga inicial de productos
        inv.agregarProducto(new Producto(3000, 5, CategoriaProducto.ALIMENTOS, "1", "Yerba"));
        inv.agregarProducto(new Producto(1500, 3, CategoriaProducto.ALIMENTOS, "2", "Pan"));
        inv.agregarProducto(new Producto(20000, 8, CategoriaProducto.ELECTRONICA, "3", "Teclado"));
        inv.agregarProducto(new Producto(25000, 10, CategoriaProducto.ROPA, "4", "Remera"));
        inv.agregarProducto(new Producto(500000, 4, CategoriaProducto.HOGAR, "5", "TV"));

        int opcion = -1;

        // Bucle principal del menú
        do {
            System.out.println("======================================");
            System.out.println("        MENÚ DEL INVENTARIO");
            System.out.println("======================================");
            System.out.println("1) Listar productos");
            System.out.println("2) Agregar producto");
            System.out.println("3) Buscar producto por ID");
            System.out.println("4) Eliminar producto por ID");
            System.out.println("5) Buscar productos por categoría");
            System.out.println("6) Actualizar stock de un producto");
            System.out.println("7) Mostrar total de stock disponible");
            System.out.println("8) Mostrar producto con mayor stock");
            System.out.println("9) Filtrar productos por precio (mínimo–máximo)");
            System.out.println("10) Mostrar categorías disponibles");
            System.out.println("0) Salir");
            System.out.println("======================================");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcion = -1; // Si el usuario no ingresa un número válido
            }

            System.out.println();

            switch (opcion) {

                case 1:
                    // Mostrar todos los productos
                    inv.mostrarProductos();
                    break;

                case 2:
                    // Agregar un nuevo producto
                    System.out.print("Ingrese ID: ");
                    String id = sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese precio: ");
                    double precio = Double.parseDouble(sc.nextLine());
                    System.out.print("Ingrese stock: ");
                    int stock = Integer.parseInt(sc.nextLine());

                    System.out.println("Categorías disponibles:");
                    for (CategoriaProducto cat : CategoriaProducto.values()) {
                        System.out.println("- " + cat.name());
                    }
                    System.out.print("Ingrese la categoría: ");
                    String catIngresada = sc.nextLine().toUpperCase();

                    try {
                        CategoriaProducto categoria = CategoriaProducto.valueOf(catIngresada);
                        inv.agregarProducto(new Producto(precio, stock, categoria, id, nombre));
                        System.out.println("Producto agregado correctamente.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Categoría inválida. Producto no agregado.");
                    }
                    break;

                case 3:
                    // Buscar producto por ID
                    System.out.print("Ingrese el ID a buscar: ");
                    String idBuscar = sc.nextLine();
                    inv.buscarProductoPorCodigo(idBuscar);
                    break;

                case 4:
                    // Eliminar producto por ID
                    System.out.print("Ingrese el ID a eliminar: ");
                    String idEliminar = sc.nextLine();
                    if (inv.eliminarPorId(idEliminar)) {
                        System.out.println("Producto eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró un producto con ese ID.");
                    }
                    break;

                case 5:
                    // Buscar productos por categoría
                    System.out.println("Categorías disponibles:");
                    for (CategoriaProducto cat : CategoriaProducto.values()) {
                        System.out.println("- " + cat.name());
                    }
                    System.out.print("Ingrese la categoría: ");
                    String catBuscada = sc.nextLine().toUpperCase();

                    try {
                        CategoriaProducto categoriaBuscada = CategoriaProducto.valueOf(catBuscada);
                        inv.busquedaPorCategoria(categoriaBuscada);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Categoría inválida.");
                    }
                    break;

                case 6:
                    // Actualizar stock
                    System.out.print("Ingrese el ID del producto: ");
                    String idStock = sc.nextLine();
                    System.out.print("Ingrese el nuevo stock: ");
                    int nuevoStock = Integer.parseInt(sc.nextLine());

                    if (inv.actualizarStock(idStock, nuevoStock)) {
                        System.out.println("Stock actualizado correctamente.");
                    } else {
                        System.out.println("No se encontró el producto.");
                    }
                    break;

                case 7:
                    // Mostrar total de stock disponible
                    int total = inv.totalStockDisponible();
                    System.out.println("El stock total disponible es: " + total);
                    break;

                case 8:
                    // Mostrar producto con mayor stock
                    Producto mayor = inv.productoConMayorStock();
                    if (mayor != null) {
                        System.out.println("Producto con mayor stock:");
                        System.out.println(mayor);
                    } else {
                        System.out.println("No hay productos en el inventario.");
                    }
                    break;

                case 9:
                    // Filtrar productos por rango de precios
                    System.out.print("Ingrese precio mínimo: ");
                    double min = Double.parseDouble(sc.nextLine());
                    System.out.print("Ingrese precio máximo: ");
                    double max = Double.parseDouble(sc.nextLine());
                    inv.filtrarPorPrecio(min, max);
                    break;

                case 10:
                    // Mostrar categorías disponibles
                    inv.mostrarCategoriasDisponibles();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();

        } while (opcion != 0);

        sc.close();
    }
}
















