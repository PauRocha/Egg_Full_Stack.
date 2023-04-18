/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class cubo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

  int i , j , n;
        
        System.out.println("Ingrese un numero para el size del cuadrado");
        n= leer.nextInt();
        
        
        for (i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        
        for ( i = 0; i < n-2; i++) {
            System.out.print("*");
            
            for ( j=0; j<n-2; j++) {
                System.out.print(" ");
                
            }
                System.out.println("*");
        }       
        
        for (i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("\n");
    }
   }
