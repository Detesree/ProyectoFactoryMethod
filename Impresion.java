 //Clase que representa un servicio de impresión.
  //Hereda de la clase Producto.
 
public class Impresion extends Producto {

    // Tipo de color usado (ejemplo: Blanco y negro, Color)
    String tipoColor;

    // Tipo de papel utilizado (ejemplo: Brillante, Mate)
    String tipoMaterialPapel;

    // Nivel de calidad de la impresión (Ejemplo: Alta, Media)
    String calidadImpresion;

    // Arreglo de fotos que se desean imprimir
    Foto[] fotos;


    // Asigna los datos de la impresión.
     
    public void asignarDatos(String nombre, double precio, String categoria, String codigo,
                             String color, String material, String calidad) {

        nombreArticulo = nombre;
        costoUnitario = precio;
        categoriaProducto = categoria;
        codigoInventarioUnico = codigo;
        tipoColor = color;
        tipoMaterialPapel = material;
        calidadImpresion = calidad;
    }

    
    // Asigna las fotos que serán impresas.
     
    public void asignarFotos(Foto[] listaFotos) {
        fotos = listaFotos;
    }

    
     // Muestra los detalles específicos de la impresión.
     
    public void detalleImpresion() {
        System.out.println("Impresión en " + tipoColor +
                " sobre papel " + tipoMaterialPapel +
                " con calidad " + calidadImpresion);

        // Mostrar las fotos asociadas, si existen
        if (fotos != null && fotos.length > 0) {
            System.out.println("Fotos asociadas:");
            for (Foto f : fotos) {
                f.mostrarFoto();
            }
        } else {
            System.out.println("No hay fotos asociadas a esta impresión.");
        }
    }
}