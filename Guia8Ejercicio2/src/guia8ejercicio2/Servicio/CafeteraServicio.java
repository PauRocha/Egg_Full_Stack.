/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio2.Servicio;

import guia8ejercicio2.Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */



public class CafeteraServicio {
    //set para escribir
    //get para leer
    
    Cafetera cafe = new Cafetera();
    Scanner leer = new Scanner(System.in);
    
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    public void llenarCafetera(){
       cafe.setCantidadActual(cafe.getCantidadMaxima());
        System.out.println("Capacidad de la cafetera: " + cafe.getCantidadActual());
    }
    
    /*Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” 
para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.*/
    
    public int servirTaza(){
        System.out.println("1- Tamaño Grande");
        System.out.println("2- Tamaño mediano");
        System.out.println("3- Tamaño Pequeño");
        
        System.out.println("Ingrese el tamaño de la taza");
        int opcion = leer.nextInt();
        int taza;
                
        if (opcion ==1) {
            taza=200;
        }else if (opcion ==2) {
            taza=150;
        }else{
            taza=80;
        }
        
        
        if (cafe.getCantidadActual() < taza) {
            System.out.println("Taza incompleta"+cafe.getCantidadActual());
           cafe.setCantidadActual(0);
            
        }else{
             int cafeRestante = cafe.getCantidadActual() - taza;
        cafe.setCantidadActual(cafeRestante);
            System.out.println("Taza llena");
        }
         System.out.println("Capacidad de la cafetera: " + cafe.getCantidadActual());
        return cafe.getCantidadActual();
        
    }
   //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    
    public void vaciarCafetera(){
        cafe.setCantidadActual(0);
         System.out.println("Capacidad de la cafetera: " + cafe.getCantidadActual());
    }
    
    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    
    public int agregarCafe(){
        System.out.println("Ingrese cantidad de cafe");
        int cantidad = leer.nextInt();
        
        if (cafe.getCantidadMaxima() < (cafe.getCantidadActual() + cantidad)) {
            
            System.out.println("Se rebalsa pibee");
            
        }else{
            cafe.setCantidadActual(cantidad + cafe.getCantidadActual());
        }
         System.out.println("Capacidad de la cafetera: " + cafe.getCantidadActual());
        return cafe.getCantidadActual();
        
    }
}
