/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciicio6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 54922
 */
public class ejercicio3Extra {
  public static void main(String[] args) {
       
      int[] vector= new int [5]; //defino tamaño
      llenarVector(vector);
      imprimirVector(vector);
}

 public static void llenarVector(int [] vector){
     Random n=new Random();
     for (int i=0; i < vector.length; i++){
         vector[i]=n.nextInt(100); // llena el vector con numeros de 0 a 99
     }
}
 
public static void imprimirVector(int [] vector){
     System.out.print("El vector: [");
     for (int i=0; i < vector.length; i++){
         System.out.print(vector[i] + " " );
     }
     System.out.print("]");
}
  }