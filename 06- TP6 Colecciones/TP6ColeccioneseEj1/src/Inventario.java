import java.util.ArrayList;

public class Inventario {
    // Lista de productos
    private ArrayList<Producto> productos = new ArrayList<>();

    // Agregar un producto al inventario
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarProductos() {
        System.out.println("Inventario de Productos");
        for (Producto prod : productos) {
            System.out.println(prod);
        }
    }

    // Busqueda por id
    public void buscarProductoPorCodigo(String id) {
        for (Producto prod : productos) {
            if (prod.getId().equals(id)) {
                System.out.println(prod);

            }

        }
        //este código se ejecuta SOLO si el for terminó sin encontrar nada
        System.out.println("El producto no está en la lista");

    }

    //Eliminar por id
    public boolean eliminarPorId(String id) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId().equals(id)) {
                productos.remove(i);
                return true;
            }
        }
        return false;
    }


    //Busqueda por Categoria
    public void busquedaPorCategoria(CategoriaProducto categoria) {
        System.out.println("Productos en la categoría: " + categoria);
        //Bandera
        Boolean encontrado = false;

        for (Producto prod : productos) {
            if (prod.getCategoria() == categoria) {
                System.out.println(prod);
                encontrado = true; // marco si encuentra al menos un producto
            }
        }
        //este código se ejecuta SOLO si el for terminó sin encontrar nada
        if (!encontrado) {
            System.out.println("No hay productos en esta categoria");
        }
    }

    //Actualizar el stock de un producto existente.
    public boolean actualizarStock(String id, int nuevoStock) {
        for (Producto prod : productos) {
            if (prod.getId().equals(id)) {
                prod.setCantidad(nuevoStock);
                return true;
            }
        }
        return false;
    }

    //Mostrar el total de stock disponible.
    public int totalStockDisponible() {

        int total = 0; // acumulador

        for (Producto prod : productos) {
            total += prod.getCantidad(); //sumo el stock de cada producto
        }
        return total;
    }


    //Obtener y mostrar el producto con mayor stock.
    public Producto productoConMayorStock() {
        if (productos.isEmpty()) {
            return null; // si no hay productos, devuelvo null

        }
        Producto mayor = productos.get(0); // el primer producto como punto de partida

        for (Producto prod : productos) {
            if (prod.getCantidad() > mayor.getCantidad()) {
                mayor = prod; // actualizamos el valor mayor
            }
        }
        return mayor;
    }

    //Filtrar productos con precios entre $1000 y $3000.
    public void filtrarPorPrecio(double min, double max) {
        System.out.println("Productos con precios entre $" + min + " y $" + max + ":");

        boolean encontrado = false;

        for (Producto prod : productos) {
            if (prod.getPrecio() >= min && prod.getPrecio() <= max) {
                System.out.println(prod);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println(" No hay productos dentro de ese rango de precios.");
        }
    }

    // Mostrar las categorías disponibles con sus descripciones.
    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorías disponibles:\n");

        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println("- " + cat.name() + ": " + cat.getDescripcion());
        }
    }


}






