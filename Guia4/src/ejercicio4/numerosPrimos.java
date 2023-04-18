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
 * Crea una aplicación que nos pida un número por teclado y con una función 
 * se lo pasamos por parámetro para que nos indique si es o no un número primo, 
 * debe devolver true si es primo, sino false.
 * Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
 * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
public class numerosPrimos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       boolean primo = false; 
        int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        mostrarNumeroPrimo(num,primo);
    }
    public static void mostrarNumeroPrimo(int num,boolean primo) {
        
        if ((num % 2 == 0) || (num % 3 == 0)){
            System.out.println("Su numero no es Primo");
        }else{
            System.out.println("Su numero es Primo");
        }
        }
    }

