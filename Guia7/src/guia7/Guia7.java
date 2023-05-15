package guia7;

import guia7.Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 *
 *
 */
public class Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro libro1 = new Libro();
        
        libro1.cargarLibro();
        
        libro1.mostrarLibro();

    }

}
