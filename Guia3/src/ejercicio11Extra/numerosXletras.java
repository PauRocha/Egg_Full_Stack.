/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11Extra;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que 
 * componen ese número. Por ejemplo, si introducimos el número 12345, el programa deberá 
 * devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
 * Nota: recordar que las variables de tipo entero truncan los números o resultados.

 */
public class numerosXletras {
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
    
      int cantidad=0;
       int numero;
       System.out.println("ingrese un nro por teclado");
       numero = leer. nextInt();
       while (numero >0){
           numero= numero/10;
                   cantidad++;
       }
       System.out.println("el nro tiene " + cantidad + " digitos");
    }
}
