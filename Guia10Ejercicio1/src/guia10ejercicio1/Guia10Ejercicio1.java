/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class Guia10Ejercicio1 {

    /**
     * @param args the command line arguments
     *
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de
     * tipo String. El programa pedirá una raza de perro en un bucle, el mismo
     * se guardará en la lista y después se le preguntará al usuario si quiere
     * guardar otro perro o si quiere salir. Si decide salir, se mostrará todos
     * los perros guardados en el ArrayList.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<String> nombreDeRazas = new ArrayList<>();
        String confirmacion = ""; 
        
        do {            
            System.out.println("Ingrese una raza de perros: ");
            nombreDeRazas.add(leer.next());
            System.out.println("¿Quiere agregar otra raza (S/N)?");
            confirmacion= leer.next();
            
        } while (confirmacion.equalsIgnoreCase("S"));
        
        for (String nombreDeRaza : nombreDeRazas) {
            System.out.println(nombreDeRaza);
            
        }
        System.out.println("**********");
        
        System.out.println("Raza a buscar");
        String razaAbuscar = leer.next();
        
        Iterator<String> it = nombreDeRazas.iterator();
        
        boolean encontrado = false;
        
        while (it.hasNext()) {
            String next = it.next();
            
            if (next.equalsIgnoreCase(razaAbuscar)) {
                
                it.remove();
                
                encontrado= true;
            }
                
        }
        
        
        if (encontrado== false) {
            System.out.println("Raza no encontrada");
            
        }
        System.out.println("**********");
        
         for (String nombreDeRaza : nombreDeRazas) {
            System.out.println(nombreDeRaza);
        }
         System.out.println("********");
    }
}
