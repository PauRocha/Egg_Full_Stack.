/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio1;

import cadenaServicio.cadenaServicio;
import guia9ejercicio1.Entidades.Cadena;
import java.util.Scanner;

/**
 *  yocapo77@gmail.com
 *
 * @author Rocha Paula
 */
public class Guia9Ejercicio1 {

 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        Cadena cadena = new Cadena(frase);
        
        cadenaServicio cadenaServicio = new cadenaServicio();
        cadenaServicio.setFrase(cadena.getFrase());
        
        System.out.println("La frase ingresa es: " + cadenaServicio.getFrase());
        System.out.println("La longitud de la frase es:" + cadenaServicio.getLongitud());
        System.out.println("Frase invertida: " + cadenaServicio.invertirFrase());
        System.out.println("Cantida de vocales de la frase: " + cadenaServicio.mostrarVocales(cadena));
        
        System.out.print("Ingrese una letra para contar repeticiones: ");
        String letra = scanner.nextLine();
        System.out.println("La letra '" + letra + "' se repite" + cadenaServicio.vecesRepetido(letra) + "veces.");
        
        System.err.print("Ingrese una frase para comparar su longitud: ");
        String otraFrase = scanner.nextLine();
        String otrafrase = null;
        System.out.println("La diferencia en longitud entre la frase ingresada y la frase comparada es: " + cadenaServicio.compararLongitud(otrafrase));
        
        System.out.print("Ingrese una frase para unir: ");
        String fraseUnida = scanner.nextLine();
        System.out.println("Frase resultante: " + cadenaServicio.unirFrases(fraseUnida));
        
        System.out.print("Ingrese una letra para reemplazar en la frase: " + cadenaServicio.getFrase() + ":");
        String letraReemplazo = scanner.nextLine();
        System.out.print("Ingrese el caracter por el que desea reemplazar '" + letraReemplazo + "': ");
        String reemplazo = scanner.nextLine();
        
        System.out.println("Frase resultante: " + cadenaServicio.reemplazar(letraReemplazo, reemplazo));
        
        System.out.print("Ingrese una letra para buscar la frase: " + cadenaServicio.getFrase()+ ":" );
                String letraBuscada = scanner.nextLine();
                System.out.println("La frase " + (cadenaServicio.contiene(letraBuscada) ? "si" : "no") + "contiene la letra '" + letraBuscada + "'.");
                
                scanner.close();
    }
                
}
    

    
    

