/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12Extra;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 *  
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los 
 * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca 
 * un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.

 */
/*public class ContadorDe3Dijitos {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
       String numero, fraseFinal;
       numero= leer.nextLine();
       fraseFinal = numero.replace("3", "E");
       System.out.println("el codigo reemplazado es");
       System.out.println(fraseFinal);
    }
    
}*/
public class Contador {
  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
      String num = String.format("%03d", i); // convierte el número en una cadena de 3 dígitos
      String numReemplazado = num.replace("3", "E"); // reemplaza los 3 por E
      System.out.println(numReemplazado);
    }
  }
}
