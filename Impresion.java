 //Clase que representa un servicio de impresión.
  //Hereda de la clase Producto.
 
public class Impresion extends Producto {

    // Tipo de color usado Blanco y negro, Color
    String tipoColor;

    // Tipo de papel utilizado  Brillante, Mate
    String tipoMaterialPapel;

    // Nivel de calidad de la impresión  Alta, Media
    String calidadImpresion;

    
     //Asigna los datos de la impresión.
     
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

    
      // Muestra los detalles específicos de la impresión.
     
    public void detalleImpresion() {
        System.out.println("Impresión en " + tipoColor +
                " sobre papel " + tipoMaterialPapel +
                " con calidad " + calidadImpresion);
    }
}
