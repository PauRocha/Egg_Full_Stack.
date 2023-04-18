/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class Guia4 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
       int a,b;
       int resultado;
       System.out.print("ingrese primer nro ");
       a= leer.nextInt();
       System.out.print ("ingrese segundo nro ");
       b= leer.nextInt();
    
     resultado =  sumar( a,b);
     System.out.print("la suma es:");
    System.out.println(resultado);
     resultado = restar(a,b);
     System.out.print("la resta es:");
    System.out.println(resultado);
     resultado = multiplicar(a,b);
     System.out.print("la multiplicacion es:");
    System.out.println(resultado);
     resultado = dividir(a,b);
     System.out.print("la division es:");
    System.out.println(resultado);
    }
   public static int sumar(int a, int b){
       int resultado = a+b;
       return resultado;
   }
   public static int restar (int a, int b){
       int resultado = a-b;
       return resultado;
   }
   public static int multiplicar (int a, int b){
       int resultado = a*b;
       return resultado;
   }
   public static int dividir (int a, int b){
       int resultado = a/b;
       return resultado;
   }
}
    
    

