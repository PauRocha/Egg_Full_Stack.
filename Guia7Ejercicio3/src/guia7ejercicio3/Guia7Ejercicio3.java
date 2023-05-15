/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio3;

import guia7ejercicio3.Entidad.Operacion;



/**
 *
 * @author Rocha Paula
 */
public class Guia7Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //instanciamos el objeto
        Operacion op = new Operacion();
        
        //aplico los metodos 
        op.crearOperacion();
        System.out.println("la suma es:"+op.sumar());
        System.out.println("la resta es:"+op.restar());
        System.out.println("la multiplicacion es:"+op.multiplicar());
        System.out.println("la division es:"+op.dividir());
    
    }

}
   