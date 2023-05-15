/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio1exteaextra;

import autobusServicio.autobusServicio;



/**
 *
 * @author Rocha Paula
 */
public class Guia8Ejercicio1ExteaExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      autobusServicio as = new autobusServicio();
        
        as.crearAutobus();
        as.subirPasajeros(10, 1);
        
        as.bajarPasajeros(5, 9);
        
        as.finRecorrido();
       
    
}
}
