


 // Clase que se encarga de crear objetos del tipo Camara.
  // Representa la fábrica para productos de tipo Camara.
 
public class FabricaCamara {

    
      // Método que crea y devuelve un objeto Camara ya configurado.
     
    public Producto crearProducto() {
        Camara cam = new Camara();

        // Asigna los valores de ejemplo
        cam.asignarDatos("Cámara Orion Z5", 2899.99, "Fotografía", "CAM-ORZ5",
                "Orion", "Z5", 24);

        // Devuelve la cámara como tipo Producto
        return cam;
    }
}
