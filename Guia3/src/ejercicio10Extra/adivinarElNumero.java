/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10Extra;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 * 
 * Realice un programa para que el usuario adivine el resultado de una multiplicación 
 * entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al 
 * usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe 
 * permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue 
 * como utilizar la función Math.random() de Java.

 */
public class adivinarElNumero {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
     int num1, num2, resultado, respuesta;
    num1=(int)(Math.random()*10);
    num2=(int)(Math.random()*10); 
    resultado=num1*num2;
        System.out.println(num1+ " y " +num2);
    do{ 
        System.out.println("escriba un valor para adivinar el resultado");
     respuesta= leer.nextInt();
     
    }while (resultado != respuesta);
        System.out.println("la respuesta ingresada es correcta");     
             
    }   
}
        
    

