/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class peliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> pelicula = new ArrayList<>();
    String confirmacion = "";

    public void crearPelicula() {

        do {
            System.out.println("Ingrese el titulo de la Pelicula:");
            pelicula.add(leer.next());

            System.out.println("Ingrese el director de la Pelicula: ");
            pelicula.add(leer.next());

            System.out.println("Ingrese la duracion de la Pelicula: ");
            pelicula.add(leer.next());

            System.out.println("Desea ingresar otra Pelicula S/N ");
            confirmacion = leer.next();

        } while (confirmacion.equalsIgnoreCase("S"));
        System.out.println("");
    }

    public void mostrsrPeliculas() {

        for (String pelicula : pelicula) {
            System.out.println(pelicula);
            System.out.println("");

        }
         System.out.println("**********");
        
        System.out.println("Pelicula a buscar: ");
        String peliculaAbuscar = leer.next();
    }

}
