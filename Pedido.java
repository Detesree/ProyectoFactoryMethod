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
     * Calcula el total a pagar del pedido sumando los precios de los productos.
     */
    public double calcularTotalPedido() {
        double total = 0;

        for (Producto p : listaProductos) {
            total += p.costoUnitario;
        }

        return total;
    }

    /**
     * Muestra la información completa del pedido.
     */
    public void mostrarDetallePedido() {
        System.out.println("=========================================");
        System.out.println("Cliente: " + comprador.nombreCliente);
        System.out.println("ID Rastreo: " + idRastreoEnvio);
        System.out.println("Fecha: " + fechaPedido);
        System.out.println("Productos comprados:");

        // Muestra los productos
        for (Producto p : listaProductos) {
            p.mostrarDatosProducto();
        }

        // Muestra el total
        System.out.println("-----------------------------------------");
        System.out.println("TOTAL A PAGAR: $" + calcularTotalPedido());
        System.out.println("=========================================");
    }
}