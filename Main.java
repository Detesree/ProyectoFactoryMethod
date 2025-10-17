import java.util.Date;


  // Clase principal que ejecuta el ejemplo del patrón Factory Method.
  // Demuestra cómo crear productos diferentes usando fábricas separadas.
 
public class Main {

    public static void main(String[] args) {

        // Crear las fotos que se van a imprimir
        Foto foto1 = new Foto("familia_retrato.jpg");
        Foto foto2 = new Foto("paisaje_vacaciones.png");
        Foto[] fotos = { foto1, foto2 };

        //  Crear los productos directamente
        Camara productoCamara = new Camara();
        productoCamara.asignarDatos("Cámara Orion Z5", 2899.99, "Fotografía", "CAM-ORZ5",
                "Orion", "Z5", 24);

        Impresion productoImpresion = new Impresion();
        productoImpresion.asignarDatos("Impresión Retrato", 15.75, "Servicio de Impresión", "IMP-RT20",
                "Color", "Papel Brillante", "Alta");
        productoImpresion.asignarFotos(fotos); // se agregan las fotos al producto

        // Crear el cliente
        Cliente cliente = new Cliente();
        cliente.asignarDatos("1089876543", "Camilo Tenorio", "3123456789", "camilo.tenorio@correo.com");

        //  Crear la lista de productos
        Producto[] listaProductos = { productoCamara, productoImpresion };

        // Crear el pedido
        Pedido pedido = new Pedido();
        pedido.asignarDatos(cliente, listaProductos, new Date(), 456123789, "ENV-CT-2025");

        //  Mostrar detalles del pedido (incluye total)
        pedido.mostrarDetallePedido();

        //  Mostrar detalles adicionales
        System.out.println("Detalles adicionales:");
        productoCamara.detalleCamara();
        productoImpresion.detalleImpresion();
    }
}