/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 * 
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

 */
public class NombreEnPantalla {
    /* @param args the command line arguments
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba su Nombre: ");
        String nombre = leer.nextLine();
        
        System.out.println("Que lindo nombre "+nombre);
    }
}
