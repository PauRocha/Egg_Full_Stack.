/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciicio6;

import java.util.Scanner;

/**
 *
 * @author 54922
 */
public class ejercicio2Extra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del primer vector: ");
        int n = scanner.nextInt();
        int[] vector1 = new int[n];

        System.out.println("Ingrese el tamaño del segundo vector: ");
        int n2 = scanner.nextInt();
        int[] vector2 = new int[n2];

        System.out.println("Ingrese los valores del  primer vector:");
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + i + ":");
            vector1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese los valores del  segundo vector:");
        for (int i = 0; i < n2; i++) {
            System.out.println("Elemento " + i + ":");
            vector2[i] = scanner.nextInt();
        }

        if (Comparar(vector1, vector2)) {
            System.out.println("Los vectores son iguales. ");
        } else {
            System.out.println("Los vectores son diferentes. ");
        }

    }

    public static boolean Comparar(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) { //si sus tamaño es diferente, los vectores no seran iguales
        }
        for (int i = 0; i < vector2.length; i++) { //si hay una diferencia entre los elementos de los vectores
            if (vector1[i] != vector2[i]) {
                return false;
            }

        }

        return true;// si no encuentra diferencia
    }
}
