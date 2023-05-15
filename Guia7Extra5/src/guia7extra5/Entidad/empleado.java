/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extra5.Entidad;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class empleado {
    
   
/**crea una clase "empleado" que tenga atributos como "nombre", "edad" y "salario".
 * Luego, crea un metodo "calcular_aumento" que calcule el aumento salarial de 
 * un empleado en funcion de su edad y salario actual.El aumento salarial debe
 * ser de 10% si el empleado tiene mas de 30 años o del 5% si tiene menos de 30
 * años.
 */


  public String nombreyApell;
   public int antiguedad;
   public int edad;
   public int salario;

    public empleado() {
        this.antiguedad=0;
        this.salario=100000;
    }

    public empleado(String nombreyApell, int antiguedad, int edad, int salario) {
        this.nombreyApell = nombreyApell;
        this.antiguedad = antiguedad;
        this.edad = edad;
        this.salario = salario;
    }

    public void setNombreyApell(String nombreyApell) {
        this.nombreyApell = nombreyApell;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNombreyApell() {
        return nombreyApell;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalario() {
        return salario;
    }
    public int calcularAumento(){
       if (antiguedad>=30){
           salario=  (salario*10/100);
           return salario;
       }else{
           salario= (salario*5/100);
           return salario;   
       }    
       }
    public void crearEmpleado(){
           Scanner leer= new Scanner(System.in);
           System.out.println("ingrese nombre y apellido del empleado:");
           nombreyApell=leer.nextLine();
           System.out.println("ingrese antiguedad:");
           antiguedad=leer.nextInt();
           System.out.println("ingrese salario");
           salario=leer.nextInt();
           
}


}