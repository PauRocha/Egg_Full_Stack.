/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Arrays;

/**
 *
 * @author Rocha Paula Método inicializarA recibe un arreglo por parámetro y lo
 * inicializa con números aleatorios. Método mostrar recibe un arreglo por
 * parámetro y lo muestra por pantalla. Método ordenar recibe un arreglo por
 * parámetro y lo ordena de mayor a menor. Método inicializarB copia los
 * primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas
 * 10 posiciones del arreglo B con 0.5. En el Main nuevamente: inicializar A,
 * mostrar A, ordenar A, inicializar B, mostrar A y B.
 */
public class ArregloService {
    //Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.

    public void inicializarA(double[] ArregloA) {

        for (int i = 0; i < ArregloA.length; i++) {
            ArregloA[i] = Math.random() * 10;
        }
    }

    //Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public void mostrar(double[] ArregloA) {

        System.out.println(Arrays.toString(ArregloA));
    }

    //Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.  
    public void Ordenar(double[] ArregloA) {
        System.out.println("");
        Arrays.sort(ArregloA);

    }

    // Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas
    // 10 posiciones del arreglo B con 0.5.
    public void inicializarB(double[] ArregloA, double[] ArregloB) {

        for (int i = 0; i < 20; i++) {

            if (i < 10) {
                ArregloB[i] = ArregloA[i];
            } else {
                ArregloB[i] = 0.5;
            }
        }
    }
}