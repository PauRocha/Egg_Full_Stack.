/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *  System.out.println("Ingrese el numero limite positivo");
        numeroLimite = leer.nextInt();

        do {

            System.out.println("Ingrese un numero");
            numero = leer.nextInt();

            suma = suma + numero;

        } while (numeroLimite >= suma);

        System.out.println("Se ha superado el numero limite de: " + numeroLimite);

 * @author Rocha Paula
 */
public class numeroLimite {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numeroLimite = leer.nextInt();
        int suma = leer.nextInt();
        int numero;
        
       do{
           System.out.println("Ingrese un Numero ");
           
           numero = leer.nextInt();
           
           suma = suma + numero;
       }while (numeroLimite >= suma); 
            System.out.println("Se ha superado el limite de: " +numeroLimite);
        
     } 
        
}
