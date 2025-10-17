// Clase base que define las propiedades comunes de todos los productos
public class Producto {

    // Nombre del producto (ejemplo: Cámara Orion Z5)
    String nombreArticulo;

    // Precio individual del producto
    double costoUnitario;

    // Categoría del producto (ejemplo: Fotografía, Impresión)
    String categoriaProducto;

    // Código único de inventario para identificar el producto
    String codigoInventarioUnico;

    
    //  Muestra la información general de un producto.
     
    public void mostrarDatosProducto() {
        System.out.println("Producto: " + nombreArticulo +
                " | Categoría: " + categoriaProducto +
                " | Precio: $" + costoUnitario +
                " | Código: " + codigoInventarioUnico);
    }
}