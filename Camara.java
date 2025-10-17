// Clase Camara que hereda de producto

public class Camara extends Producto {

    // Nombre del fabricante (ejemplo: Canon, Orion)
    String fabricante;

    // Modelo o versión de la cámara
    String versionModelo;

    // Resolución óptica de la cámara en megapíxeles
    int resolucionOpticaMP;

    
    // Asigna los datos a todos los atributos de la cámara.
     
    public void asignarDatos(String nombre, double precio, String categoria, String codigo,
                             String marca, String modelo, int resolucion) {

        nombreArticulo = nombre;
        costoUnitario = precio;
        categoriaProducto = categoria;
        codigoInventarioUnico = codigo;
        fabricante = marca;
        versionModelo = modelo;
        resolucionOpticaMP = resolucion;
    }

    
    // Muestra los detalles específicos de la cámara.
     
    public void detalleCamara() {
        System.out.println("Cámara " + fabricante + " modelo " + versionModelo +
                " con " + resolucionOpticaMP + "MP de resolución.");
    }
}