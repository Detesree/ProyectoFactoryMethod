 //Clase que representa un servicio de impresión.
  //Hereda de la clase Producto.
 
public class Impresion extends Producto {

    // Atributos específicos de la impresión
    String tipoColor;
    String tipoMaterialPapel;
    String calidadImpresion;
    Foto[] fotos;

    
    //  Asigna los datos generales y específicos de la impresión.
     
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

    
    // Asigna las fotos que se imprimirán.
     
    public void asignarFotos(Foto[] listaFotos) {
        fotos = listaFotos;
    }

    
    // Muestra los detalles específicos de la impresión y las fotos asociadas.
     
    public void detalleImpresion() {
        System.out.println("Impresión: " + tipoColor + " | Papel: " + tipoMaterialPapel +
                " | Calidad: " + calidadImpresion);
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