// Clase que se encarga de crear objetos del tipo Impresion.
 // Representa la fábrica para productos de tipo Impresion.
 
public class FabricaImpresion {

    
     // Método que crea y devuelve un objeto Impresion ya configurado.
     
    public Producto crearProducto() {
        Impresion imp = new Impresion();

        // Asigna los valores de ejemplo
        imp.asignarDatos("Impresión Retrato", 15.75, "Servicio de Impresión", "IMP-RT20",
                "Color", "Papel Brillante", "Alta");

        // Devuelve la impresión como tipo Producto
        return imp;
    }
}
