// Clase Camara que hereda de producto

public class Camara extends Producto{
    String fabricante;
    String versionModelo;
    int resolucionOpticaMP;

    // Método para asignar los valores de los atributos
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

    // Método para mostrar los detalles específicos de una cámara
    public void detalleCamara() {
        System.out.println("Cámara " + fabricante + " modelo " + versionModelo +
                           " con " + resolucionOpticaMP + "MP de resolución.");
    }
}

