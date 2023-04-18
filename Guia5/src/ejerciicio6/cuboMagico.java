/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciicio6;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 * 
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
 * del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales 
 * son idénticas. Crear un programa que permita introducir un cuadrado por 
 * teclado y determine si este cuadrado es mágico o no. El programa deberá 
 * comprobar que los números introducidos son correctos, es decir, están entre 
 * el 1 y el 9.

 */
public class cuboMagico {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int sumaFila=0, sumaColumna=0, sumaDiagonal=0;
        int[][] matriz = new int[3][3];
        
        System.out.println("Ingresar los valores del 1 al 9 de la matriz: ");
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                do {                    
                    matriz [i] [j] = leer.nextInt(); 
                            
                     if(matriz [i] [j] < 1 || matriz [i][j] >9){
                         System.out.println("El numero ingresado es incorrecto. Vuelva a intentar: ");
                     }
                } while (matriz[i][j] < 1 && matriz[i][j] >9);
                    
            }
        }
        System.out.println("Matriz original");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}

/*ejercicio5
/*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = sc.nextInt();

        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("La matriz ingresada es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        boolean antiSimetrica = true;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    antiSimetrica = false;
                    break;
                }
            }
            if (!antiSimetrica) {
                break;
            }
        }

        if (antiSimetrica) {
            System.out.println("La matriz es anti simétrica");
        } else {
            System.out.println("La matriz no es anti simétrica");
        }
    }*/

/*public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int sumFila1 = 0, sumFila2 = 0, sumFila3 = 0; 
        int sumColumna1 = 0, sumColumna2 = 0, sumColumna3=0;
        int sumDiagonal = 0, sumDiagonal2 = 0;
        int [][] matriz = new int [3][3];
        System.out.println("Ingresar los valores del 1 al 9 a la matriz: ");
        for(int i = 0; i<3;i++){
            for (int j = 0; j < 3; j++) {
                do{
                    matriz[i][j] = leer.nextInt();
                    if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                        System.out.println("El numero ingresado es incorrecto. Vuelve a ingresar: ");
                    }
                }while(matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }
        
        System.out.println("Matriz original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                sumFila1 += matriz[0][j];
                sumFila2 += matriz[1][j];
                sumFila3 += matriz[2][j];
                sumColumna1 += matriz[i][0];
                sumColumna2 += matriz[i][1];
                sumColumna3 += matriz[i][2];
                sumDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
                sumDiagonal2= matriz[2][2] + matriz[1][1] + matriz[0][0];
            }
            System.out.println("");
        }
        System.out.println("");
        if(sumFila1 == sumFila2 && sumFila1 == sumFila3 && sumColumna1 == sumColumna2 && sumColumna1 == sumColumna3 && sumDiagonal== sumDiagonal2){
            System.out.println("La matriz es un cuadrado magico");
        }else{
            System.out.println("La matriz no es un cuadrado magico");
        }
    }
        
        
}*/