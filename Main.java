import java.util.Date;


  // Clase principal que ejecuta el ejemplo del patrón Factory Method.
  // Demuestra cómo crear productos diferentes usando fábricas separadas.
 
public class Main {

    public static void main(String[] args) {

        // 1️⃣ Crear los productos directamente
        Camara productoCamara = new Camara();
        productoCamara.asignarDatos("Cámara Orion Z5", 2899.99, "Fotografía", "CAM-ORZ5",
                "Orion", "Z5", 24);

        Impresion productoImpresion = new Impresion();
        productoImpresion.asignarDatos("Impresión Retrato", 15.75, "Servicio de Impresión", "IMP-RT20",
                "Color", "Papel Brillante", "Alta");

        // 2️⃣ Crear el cliente
        Cliente cliente = new Cliente();
        cliente.asignarDatos("1089876543", "Camilo Tenorio", "3123456789", "camilo.tenorio@correo.com");

        // 3️⃣ Crear la lista de productos del pedido
        Producto[] listaProductos = { productoCamara, productoImpresion };

        // 4️⃣ Crear el pedido
        Pedido pedido = new Pedido();
        pedido.asignarDatos(cliente, listaProductos, new Date(), 456123789, "ENV-CT-2025");

        // 5️⃣ Mostrar los detalles del pedido y total a pagar
        pedido.mostrarDetallePedido();

        // 6️⃣ Mostrar detalles adicionales simples
        System.out.println("Detalles adicionales:");
        productoCamara.detalleCamara();
        productoImpresion.detalleImpresion();
    }
}