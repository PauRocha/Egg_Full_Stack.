/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y
 * el programa deberá mostrar el resultado por pantalla y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
 * que, si el usuario selecciona la opción 5, en vez de salir del programa
 * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
 * seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 *
 * @author Rocha Paula
 */

public class menu {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean salir= false;
        int num1;
        int num2;
        int opcion;
        int num;
        String respuesta;
      
       
            System.out.println("Ingrese un numero");
            num1 = leer.nextInt();
            
            System.out.println("Ingrese otro numero ");
            num2 = leer.nextInt();
            
            System.out.println("Aprete 0 para continuar");
            num = leer.nextInt();

        do {
            System.out.println("");
            System.out.println("");
            System.out.println("***MENU***");
            System.out.println("");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Elija opcion:");
            System.out.println("-----------------");
            
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su suma es: " + (num1 + num2));
                    salir = true;
                    break;

                case 2:
                    System.out.println("Su resta es: " + (num - num2));
                    salir = true;
                    break;

                case 3:
                    System.out.println("Su multiplicacion es: " + (num * num2));
                    salir = true;
                    break;

                case 4:
                       if(num2 == 0){
                        System.out.println("No es posible dividir por 0, intente nuevamente");
                    }else{    
                        System.out.println("El resultado de la division es: " + (num / num2));
                    }
                       
                    salir = true;
                    break;
                                      
                case 5:
 
                     System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    respuesta = leer.next();
                
                   if (respuesta.equalsIgnoreCase("S")) {
                        salir=false;
                    }else{
                        salir=true;
                    }
                     break;  
            default:
                    System.out.println("OPCION INCORRECTA");
                    break;
            }  
        } while (salir);
        
       
    System.out.println("Fin del Programa");
}
    
}