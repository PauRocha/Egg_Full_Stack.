/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2Extra;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula Dado un tiempo en minutos, calcular su equivalente en
 * días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema
 * debe calcular su equivalente: 1 día, 2 horas.
 *
 */
     
public class cambioDeLetra {

    public static void main(String[] args){
     
    Scanner leer = new Scanner(System.in);
        
    int A = 2, B = 3, C = 4, D = 5, aux;

        System.out.println("Los valores para: ");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Los valores para: ");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

    }

}
