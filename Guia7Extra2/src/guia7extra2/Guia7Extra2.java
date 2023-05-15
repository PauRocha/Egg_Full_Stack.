/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extra2;

import guia7extra2.Entidad.puntos;

/**
 *
 * @author Rocha Paula
 */
public class Guia7Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          puntos p = new puntos();
       p.crearPuntos(2, 3, 1, 2);
        System.out.println("la distancia es: "+p.calcularDistancia());
    }
    
    }
    
