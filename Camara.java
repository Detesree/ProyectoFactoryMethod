// Clase Camara que hereda de producto

public class Camara extends Producto {

    // Atributos específicos de la cámara
    String fabricante;
    String versionModelo;
    int resolucionOpticaMP;

    
    // Asigna los datos específicos de la cámara.
     
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

    
    //  Muestra los detalles específicos de la cámara.
     
    public void detalleCamara() {
        System.out.println("Cámara: " + fabricante + " " + versionModelo +
                " | Resolución: " + resolucionOpticaMP + "MP");
    }
}
