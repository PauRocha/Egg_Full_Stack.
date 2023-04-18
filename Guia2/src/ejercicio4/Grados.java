/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 * 
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
public class Grados {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados a convertir: ");
        
        int celcius = leer.nextInt();
        int fahrenheit = 32 + (9 * celcius /5);
        
        System.out.println("Su equivalencia en fahrenheit es de: " + fahrenheit);
    }
}
