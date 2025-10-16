import java.util.Date;


  // Clase principal que ejecuta el ejemplo del patrón Factory Method.
  // Demuestra cómo crear productos diferentes usando fábricas separadas.
 
public class Main {

    public static void main(String[] args) {

        // 1️⃣ Crear las fábricas
        FabricaCamara fabricaCamara = new FabricaCamara();
        FabricaImpresion fabricaImpresion = new FabricaImpresion();

        // 2️⃣ Crear los productos usando las fábricas
        Producto productoCamara = fabricaCamara.crearProducto();
        Producto productoImpresion = fabricaImpresion.crearProducto();

        //  Crear el cliente
        Cliente cliente = new Cliente();
        cliente.asignarDatos("1089876543", "Camilo Tenorio", "3123456789", "camilo.tenorio@correo.com");

        // 4 Crear la lista de productos del pedido
        Producto[] listaProductos = { productoCamara, productoImpresion };

        //  Crear el pedido
        Pedido pedido = new Pedido();
        pedido.asignarDatos(cliente, listaProductos, new Date(), 456123789, "ENV-CT-2025");

        // Mostrar detalles del pedido (incluye el total calculado)
        pedido.mostrarDetallePedido();

        //  Detalles adicionales simples
        System.out.println("Detalles adicionales:");
        System.out.println("- Cámara Orion Z5, resolución 24MP");
        System.out.println("- Impresión color, papel brillante, calidad alta");
    }
}
