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
 */
public class letraA {
    public static void main(String[] args) {
        Scanner leer = new  Scanner(System.in);
        System.out.println("Escriba una letra ");
        String frase = leer.nextLine();
        
        if((frase.substring(0,1)).equals("A")){
            System.out.println("CORRECTO");
    }else{
            System.out.println("Incorrecto");
    }
}
}