/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 * Diseñe una función que pida el nombre y la edad de N personas 
 * e imprima los datos de las personas ingresadas por teclado e indique 
 * si son mayores o menores de edad. Después de cada persona, el programa debe 
 * preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el 
 * usuario ingrese la palabra “No”.

 */
public class nombres {
public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String respuesta;

        do {

            mostrarMayor();

            //leer.nextLine();
            System.out.println("¿desea seguir mostrando personas?");
            respuesta = leer.next();

        } while (!respuesta.equalsIgnoreCase("no"));

    }

    public static void mostrarMayor() {

        String nombre;
        int edad;

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese nombre");
        nombre = leer.nextLine();
        System.out.println("ingrese edad");
        edad = leer.nextInt();

        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad ");

        } else {
            System.out.println(nombre + " No es mayor de edad ");
        }
    }

}