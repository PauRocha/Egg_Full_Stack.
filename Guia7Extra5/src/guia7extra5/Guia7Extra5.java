/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extra5;
import guia7extra5.Entidad.empleado;
import java.util.Scanner;
/**
 *
 * @author Rocha Paula
 */
public class Guia7Extra5 {

/**crea una clase "empleado" que tenga atributos como "nombre", "edad" y "salario".
 * Luego, crea un metodo "calcular_aumento" que calcule el aumento salarial de 
 * un empleado en funcion de su edad y salario actual.El aumento salarial debe
 * ser de 10% si el empleado tiene mas de 30 años o del 5% si tiene menos de 30
 * años.
 */
    /**
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        empleado em1 = new empleado();
        em1.crearEmpleado();
        em1.calcularAumento();
        
        System.out.println("ingrese nombre y apellido:"+em1.getNombreyApell());
        System.out.println("su antiguedad es: "+em1.getAntiguedad());
        System.out.println("su aumento es: "+em1.getSalario());
        
        
    }
    
}
    
    

