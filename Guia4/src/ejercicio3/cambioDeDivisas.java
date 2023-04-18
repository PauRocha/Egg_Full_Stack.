/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class cambioDeDivisas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int euros;
     
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros");
       euros = leer.nextInt();
      convertirEuros(euros);
    }
   public static void convertirEuros( int euros){
       System.out.println(euros +" euros es equivalente a: " +(euros * 0.86) + " libras");
       System.out.println(euros +" euros es equivalente a: " +(euros *1.286) + " dolares");
       System.out.println(euros +" euros es equivalente a: " +(euros *129.85) + " yenes");
   }
}

