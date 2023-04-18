/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 * 
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
 * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
 * Nota: investigar la función equals() en Java.

 */
public class eureka {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        String fraseCompara = "eureka";
        System.out.println("Escriba una Frase: ");
        String frase = leer.nextLine();
        
        if(frase.equals(fraseCompara)){
            System.out.println("Su palabra es CORRECTA.");        
        }else{
            System.out.println("Su palabra es INCORRECTA");
            
        }
    }
}    
     

