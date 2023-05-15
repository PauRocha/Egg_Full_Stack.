/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extra2.Entidad;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 *
 * @author Rocha Paula
 * 
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un 
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos 
 * números y los ingresa en los atributos del objeto. Después, a través de otro 
 * método calcular y devolver la distancia que existe entre los dos puntos que 
 * existen en la clase Puntos. Para conocer como calcular la distancia entre dos 
 * puntos consulte el siguiente link:
 * 
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

 */
public class puntos {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    
    
    /*constructor vacio*/

    public puntos() {
    }
    
    /*constructor de x1,x2 e y1,y2*/

    public puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    

    /*metodo set x e y*/
    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    
    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    /*metodo get de x e y */

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }
    
    /*Generar un 
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos 
 * números y los ingresa en los atributos del objeto.*/
    
    public void crearPuntos (double x1, double x2, double y1, double y2){
        this.x1= x1;
        this.x2 =x2;
        this.y1= y1;
        this.y2= y2;
        
    }
    
    /* Después, a través de otro 
 * método calcular y devolver la distancia que existe entre los dos puntos que 
 * existen en la clase Puntos.*/
    
    public double calcularDistancia(){
        double distancia;
        
       distancia= Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
       return distancia;
    }
}
