import java.util.Date;


 //Clase que representa un pedido realizado por un cliente.
 //Contiene una lista de productos, la fecha, la forma de pago y un código de rastreo.
 
public class Pedido {

    // Cliente que realiza el pedido
    Cliente comprador;

    // Lista de productos incluidos en el pedido
    Producto[] listaProductos;

    // Fecha en que se realiza el pedido
    Date fechaPedido;

    // Número de tarjeta con la que se paga (solo ejemplo)
    int numeroTarjetaPago;

    // Código de rastreo del envío
    String idRastreoEnvio;

    /**
     * Asigna los datos principales del pedido.
     */
    public void asignarDatos(Cliente c, Producto[] productos, Date fecha, int tarjeta, String rastreo) {
        comprador = c;
        listaProductos = productos;
        fechaPedido = fecha;
        numeroTarjetaPago = tarjeta;
        idRastreoEnvio = rastreo;
    }

    /**
     * Muestra toda la información general del pedido.
     */
    public void mostrarDetallePedido() {
        System.out.println("=========================================");
        System.out.println("Cliente: " + comprador.nombreCliente);
        System.out.println("ID Rastreo: " + idRastreoEnvio);
        System.out.println("Fecha: " + fechaPedido);
        System.out.println("Productos comprados:");

        // Recorre la lista y muestra los datos de cada producto
        for (Producto p : listaProductos) {
            p.mostrarDatosProducto();
        }

        // Muestra el total calculado
        System.out.println("-----------------------------------------");
        System.out.println("TOTAL A PAGAR: $" + calcularTotalPedido());
        System.out.println("=========================================");
    }

    
      //Calcula el total a pagar del pedido sumando los precios de cada producto.
     //retorna el total del pedido
     
    public double calcularTotalPedido() {
        double total = 0;

        // Suma el costo de todos los productos en el pedido
        for (Producto p : listaProductos) {
            total += p.costoUnitario;
        }

        return total;
    }
}
