/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1Extra;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class Tiempo {
      public static void main(String[] args) {
        int minutos, horas, dias;
          Scanner leer= new Scanner(System.in);
        System.out.println("introducir el numero de minutos: ");
        minutos = leer.nextInt();
     
        horas = minutos /60;
        minutos = minutos % 60;
        dias = horas /24;
        horas= horas % 24;
        System.out.println( "los valores ingresados son:" + dias+ " dias, " + horas+ " horas " +minutos +" minutos");
    }  
}
