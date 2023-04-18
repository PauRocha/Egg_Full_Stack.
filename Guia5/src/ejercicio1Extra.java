
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rocha Paula
 */
public class ejercicio1Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];

        System.out.println("Ingrese los valores del vector:");
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + i + ":");
            vector[i] = leer.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }
        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}
