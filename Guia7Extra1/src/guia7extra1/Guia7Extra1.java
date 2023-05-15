/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extra1;

import guia7extra1.Entidad.cancion;

/**
 *
 * @author Rocha Paula
 * 
 * 
 */
public class Guia7Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cancion can1 = new cancion();
        
        can1.setTitulo("Navegando");
       can1.setAutor("Willian Costa");
       
        System.out.println("Titulo de la cancion: " + can1.getTitulo());
        System.out.println("Autor: " + can1.getAutor());
    }
    
}
