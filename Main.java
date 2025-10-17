import java.util.Date;


  // Clase principal que ejecuta el ejemplo del patrón Factory Method.
  // Demuestra cómo crear productos diferentes usando fábricas separadas.
 
public class Main {

    public static void main(String[] args) {

        // 1️⃣ Crear las fotos que se imprimirán
        Foto foto1 = new Foto("familia_retrato.jpg");
        Foto foto2 = new Foto("paisaje_vacaciones.png");
        Foto[] listaFotos = { foto1, foto2 };

        //  Crear las subclases concretas de Producto
        Camara camara = new Camara();
        Impresion impresion = new Impresion();

        //  Asignar datos a la cámara
        camara.asignarDatos("Cámara Orion Z5", 2899.99, "Fotografía", "CAM-ORZ5",
                "Orion", "Z5", 24);

        //  Asignar datos a la impresión
        impresion.asignarDatos("Impresión Retrato", 15.75, "Servicio de Impresión", "IMP-RT20",
                "Color", "Papel Brillante", "Alta");

        // Asignar las fotos a la impresión
        impresion.asignarFotos(listaFotos);

        //  Aplicar herencia: manejar los objetos a través de la clase abstracta Producto
        Producto productoCamara = camara;
        Producto productoImpresion = impresion;

        //  Crear el cliente
        Cliente cliente = new Cliente();
        cliente.asignarDatos("1089876543", "Camilo Tenorio", "3123456789", "camilo.tenorio@correo.com");

        // 7️⃣ Crear el listado de productos del pedido
        Producto[] productosPedido = { productoCamara, productoImpresion };

        // 8️⃣ Crear el pedido
        Pedido pedido = new Pedido();
        pedido.asignarDatos(cliente, productosPedido, new Date(), 456123789, "ENV-CT-2025");

        // 9️⃣ Mostrar los detalles del pedido y el total
        pedido.mostrarDetallePedido();

        // 🔟 Mostrar detalles específicos de los productos
        System.out.println("\nDetalles adicionales:");
        camara.detalleCamara();
        impresion.detalleImpresion();
    }
}