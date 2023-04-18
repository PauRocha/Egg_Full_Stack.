/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.N;

/**
 *
 * @author Rocha Paula
 *
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido
 *
 */
public class VectorTamañoN {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector: ");

        int cant = leer.nextInt();
        int contador = 0;

        int[] vector = new int[cant];

        for (int i = 0; i < cant; i++) {
            vector[i] = (int) (Math.random() * (10 - 1) + 1);

        }
        for (int i = 0; i < cant; i++) {
            System.out.println("[" + vector[i] + "]");
        }
        System.out.println("Ingrese un Numero a buscar ");
        int numero = leer.nextInt();

        for (int i = 0; i < cant; i++) {

            if (vector[i] == numero) {
                System.out.println("El numero se encuentra en la posicion: " + i);
                contador++;
            }

        }
        if (contador == 1) {
            System.out.println("El numero no se encuentra repetido ");
        }
        if (contador == 0) {
            System.out.println("El numero no se encuentra en el vector");

        } else {
            System.out.println("El numero se encuentra repetido " + contador + " veces");
        }
    }
}
