/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciicio6;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 54922
 */
public class ejercicio5Extra {
    public static void main(String[] args) {
        
        int N = 3; // Número de filas
        int M = 4; // Número de columnas

        // Crear la matriz NxM
        int[][] matriz = new int[N][M];

       // Llenar la matriz con valores aleatorios entre 1 y 100
        random = new Random();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // suma de los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma += matriz[i][j];
            }
        }

  
        System.out.println("Suma de los elementos: " + suma);
    }
}

