// Clase que representa a un cliente que realiza pedidos.
 
public class Cliente {

    // Cédula o número de identificación del cliente
    String nroIdentificacion;

    // Nombre completo del cliente
    String nombreCliente;

    // Teléfono de contacto del cliente
    String telefonoContacto;

    // Correo electrónico principal del cliente
    String correoPrincipal;

    /**
     * Asigna los datos del cliente.
     */
    public void asignarDatos(String id, String nombre, String telefono, String correo) {
        nroIdentificacion = id;
        nombreCliente = nombre;
        telefonoContacto = telefono;
        correoPrincipal = correo;
    }
}
