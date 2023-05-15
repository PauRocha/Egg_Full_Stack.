/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio3;

import Servicios.PersonaServicio;
import guia8ejercicio3.Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class Guia8Ejercicio3 {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
    
     PersonaServicio persona = new PersonaServicio();
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese la cantidad de personas: ");
     int Num = leer.nextInt();
     Persona[]personas = new Persona[Num]; 
     boolean[]MayorEdad = new boolean[Num];
     int[]imcV = new int[Num];
     int contMe=0,contnoMe=0;
     double contSP=0,contPI=0,contBP=0; 
     
        for (int i = 0; i < Num; i++) {
        personas[i] = persona.crearPersona();
        MayorEdad[i] =persona.MayorDeEdad();
            if (MayorEdad[i]) {
            contMe++;    
            }else{
            contnoMe++;    
            }
        imcV[i] = persona.calcularIMC();
        switch(imcV[i])  {
            case 1:
            System.out.println("La persona tiene sobrepeso");
            contSP++;
            break;
            case 0:
            System.out.println("La persona tiene peso ideal"); 
            contPI++;
            break;
            default: 
             System.out.println("La persona tiene bajo peso");    
             contBP++;
             break;    
        }
        }
        System.out.println("Porcentaje de las personas con sobrepeso: " +((contSP/Num)*100)+"%" );
        System.out.println("Porcentaje de las personas con peso ideal: " +((contPI/Num)*100)+"%");
        System.out.println("Porcentaje de las personas con bajo peso: " +((contBP/Num)*100)+"%");
        
        System.out.println("Son mayores de edad: "+contMe);
        System.out.println("Son menores de edad: "+contnoMe);
   }
    
}