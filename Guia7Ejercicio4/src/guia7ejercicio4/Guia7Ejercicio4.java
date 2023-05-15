/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio4;

import guia7ejercicio4.Entidad.rectangulo;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class Guia7Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la base: ");
        double base = leer.nextDouble();
        System.out.println("ingrese la altura: ");
        double altura =leer.nextDouble();
        
        rectangulo rec= new rectangulo();
        
        rec.crearRectangulo(altura, base);
        
        System.out.println("la superficie es : "+rec.calcularSuperficie());
        System.out.println("el perimetro es: "+rec.calcularPerimetro());
        rec.dibujar();
        
    }  
    }
    

