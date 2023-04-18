/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula Recorrer un vector de N enteros contabilizando cuántos
 * números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 */
public class contadorN {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector: ");

        int cant = leer.nextInt();
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;

        int[] vector = new int[cant];

        for (int i = 0; i < cant; i++) {
            vector[i] = (int) (Math.random() * (99999 - 1) + 1);

        }
        /*for (int i = 0; i < cant; i++) {
            System.out.println("[" + vector[i] + "]");
        }*/
        for (int i = 0; i < cant; i++) {
            int digito = digitosDeUnNumero(vector[i]);

            switch (digito) {

                case 1:
                    cont1++;
                    break;

                case 2:
                    cont2++;
                    break;

                case 3:
                    cont3++;
                    break;

                case 4:
                    cont4++;
                    break;

                case 5:
                    cont5++;
                    break;

            }
        }
        System.out.println("En el vector hay " + cont1 + " numeros de una cifra");
        System.out.println("En el vector hay " + cont2 + " numeros de dos cifras");
        System.out.println("En el vector hay " + cont3 + " numeros de tres cifras");
        System.out.println("En el vector hay " + cont4 + " numeros de cuatro cifras");
        System.out.println("En el vector hay " + cont5 + " numeros de cinco cifras");
    }

    public static int digitosDeUnNumero(int paula) {

        int cifras = 0;

        while (paula > 0) {

            paula = paula / 10;

            cifras++;
        }

        return cifras;
    }
}
