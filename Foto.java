//Clase que representa una fotografía o imagen asociada a una impresión.
 
public class Foto {

    // Nombre o ruta del archivo de la fotografía
    String fichero;

    
     //Constructor de la clase Foto.
     //Nombre o ruta del archivo de imagen
     
    public Foto(String fichero) {
        this.fichero = fichero;
    }

    
     //Método que muestra el nombre del archivo de la foto.
     
    public void mostrarFoto() {
        System.out.println("Archivo de foto: " + fichero);
    }
}

