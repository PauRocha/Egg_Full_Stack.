/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3Extra;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 * 
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte 
 * si se trata de una vocal. Caso contrario mostrar un mensaje. 
 * Nota: investigar la función equals() de la clase String.

 */
public class vocal {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Escriba una letra");
        letra = leer.next();
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra es una vocal"); 
        } else  {
            System.out.println("La letra no es una vocal, por favor reintente con otra letra.");
        }
    }
    
}

