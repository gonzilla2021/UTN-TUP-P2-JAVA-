public class Producto {
    //Atributos
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(double precio, int cantidad, CategoriaProducto categoria, String id, String nombre) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.id = id;
        this.nombre = nombre;
    }

    //Metodos

    public String getId() {
        return id;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", categoria=" + categoria +
                '}';
    }
}
