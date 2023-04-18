/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * Crear un programa que dado un número determine si es par o impar.

 * @author Rocha Paula
 */
public class parOinpar {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero= leer.nextInt();
        
           if (numero % 2 == 0) {
               System.out.println("Su numero "+numero+" es par");
        }else{
               System.out.println("Su numero "+numero+" es impar");
           }
 
            
        }
    }