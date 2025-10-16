// Clase base que define las propiedades comunes de todos los productos
public class Producto {
    // Nombre del producto
    String nombreArticulo;
    // Precio del producto
    double costoUnitario;
    // Categoría a la que pertenece el producto (Ej: Fotografía, Impresión)
    String categoriaProducto;
    // Código único de inventario
    String codigoInventarioUnico;

    // Método que muestra la información general de cualquier producto
    public void mostrarDatosProducto() {
        System.out.println("Producto: " + nombreArticulo +
                           " | Categoría: " + categoriaProducto +
                           " | Precio: $" + costoUnitario +
                           " | Código: " + codigoInventarioUnico);
    }
}
