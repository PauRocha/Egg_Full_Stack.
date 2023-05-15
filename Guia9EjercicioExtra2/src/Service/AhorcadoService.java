/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import guia9ejercicioextra2.Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class AhorcadoService {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String letra;
    int cuantasVeces;
    boolean son;
    
    
    public Ahorcado crearJuego() {
        Ahorcado juego = new Ahorcado();
        System.out.println("INGRESE LA PALABRA A ADIVINAR:");
        String palabra = leer.next();
        String[] vector = new String[palabra.length()];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = palabra.substring(i, i+1);  
        }
        juego.setVecPalabra(vector);
        System.out.println("Ingrese la Cantidad de Jugadas Máxima: ");
        juego.setCantidadJugadasMaximas(leer.nextInt());
        return juego;
    }
    
    public void longitud(Ahorcado juego) {
        System.out.println("La longitud de la Palabra a Buscar es de " + juego.getVecPalabra().length + " letras."); 
    } 
    
    public void buscarLetra(Ahorcado juego) {
        String[] vecAux = new String[juego.getVecPalabra().length];
        mostrarAvance(vecAux);
        do {
            cuantasVeces = 0;
            System.out.println("");
            System.out.println("Ingrese una Letra para saber si está en la Palabra.");
            letra = leer.next();
            for (int i = 0; i < juego.getVecPalabra().length; i++) {
                if (juego.getVecPalabra()[i].equalsIgnoreCase(letra)) {
                    cuantasVeces++;
                    vecAux[i] = juego.getVecPalabra()[i];
                } 
            }
            System.out.println("");
            if (cuantasVeces == 0) {
                System.out.println("La letra ingresada NO pertenece a la palabra.");
                letrasEncontradas(juego);
                intentos(juego);
            } else {
                System.out.println("La letra ingresada SI pertenece a la palabra.");
                letrasEncontradas(juego);
                intentos(juego);
            }
            System.out.println("");
            mostrarAvance(vecAux);
            System.out.println("=================================================");
        } while ((juego.getCantidadJugadasMaximas() > 0) && (!(juego.getVecPalabra().length==juego.getCantidadLetrasEncontradas())));

    }
    
    public boolean letrasEncontradas(Ahorcado juego) {
        
        if (cuantasVeces != 0) {
            juego.setCantidadLetrasEncontradas(juego.getCantidadLetrasEncontradas() + cuantasVeces);
            System.out.println("Número de Letras (encontradas/faltantes): (" + juego.getCantidadLetrasEncontradas() + "/"
                    + (juego.getVecPalabra().length - juego.getCantidadLetrasEncontradas()) + ")");
           son =  true;
        } else {
            System.out.println("Número de Letras (encontradas/faltantes): (" + juego.getCantidadLetrasEncontradas() + "/"
            + (juego.getVecPalabra().length - juego.getCantidadLetrasEncontradas()) + ")");
            son = false;
        }
        return son;
    }
    
    public void intentos(Ahorcado juego) {
        if (son!=true) {
            juego.setCantidadJugadasMaximas(juego.getCantidadJugadasMaximas()-1); 
        }
        System.out.println("Número de Oportunidades Restantes: "+juego.getCantidadJugadasMaximas());
    }
    
    public void juego(Ahorcado juego) {
        longitud(juego);
        System.out.println("");
        buscarLetra(juego);
        System.out.println("");
        if (juego.getVecPalabra().length==juego.getCantidadLetrasEncontradas()) {
            System.out.println("Has GANADO!!! -- Descubriste la PALABRA!!!!");
        } else {
            System.out.println("Has PERDIDO -- Te has quedado SIN INTENTOS....");
        }
    
    }
    
    public void mostrarAvance(String[] vec) {
        for (int i = 0; i < vec.length; i++) {
            if (vec[i]== null) { 
                vec[i] = "_ ";
            }
            System.out.print(vec[i]+" ");
        }
        System.out.println("");
    }
    
    
}
