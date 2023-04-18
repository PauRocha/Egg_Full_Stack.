/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8Extra;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 * 
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
 * debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
 * números pares y la cantidad de números impares. Al igual que en el ejercicio anterior 
 * los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

 */
public class numerosEnteros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num, pares, impares, suma;
        pares = 0;
        impares = 0;
        suma = 0;
        
        do{
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num > 0) {
               if ((num % 2) == 0) {
                    pares++;

                } else {
                    impares++;
                }
                suma = suma + num;
            }

        } while (!(num % 5 == 0));

        System.out.println(pares + " pares");
        System.out.println(impares + " impares");
        System.out.println("La cantidad total de numeros ingresados es "+(pares+impares));
    }

} 
            
