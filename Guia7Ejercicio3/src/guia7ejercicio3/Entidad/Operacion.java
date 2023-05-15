/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio3.Entidad;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 *
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuación, se deben crear los siguientes métodos: Método
 * constructor con todos los atributos pasados por parámetro. Método constructor
 * sin los atributos pasados por parámetro. Métodos get y set. Método para
 * crearOperacion(): que le pide al usuario los dos números y los guarda en los
 * atributos del objeto. Método sumar(): calcular la suma de los números y
 * devolver el resultado al main. Método restar(): calcular la resta de los
 * números y devolver el resultado al main Método multiplicar(): primero valida
 * que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
 * el método devuelve 0 y se le informa al usuario el error. Si no, se hace la
 * multiplicación y se devuelve el resultado al main Método dividir(): primero
 * valida que no se haga una división por cero, si fuera a pasar una división
 * por cero, el método devuelve 0 y se le informa al usuario el error se le
 * informa al usuario. Si no, se hace la división y se devuelve el resultado al
 * main.
 *
 */
public class Operacion {

    /*clase privada numero1 y numero2*/
   private double num1;
    private double num2;

    public Operacion() {
    }

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }   

public void crearOperacion(){
    Scanner leer= new Scanner(System.in);
    System.out.println("ingrese num1:");
           this.num1=leer.nextDouble();
           System.out.println("ingrese num2:");
           this.num2= leer.nextDouble();
                     
}
public double sumar(){
    
   return   this.num1 +this.num2;
}
public double restar(){
    
   return   this.num1 -this.num2;
}
public double multiplicar(){
    if (this.num1==0 || this.num2==0){
        System.out.println("se produjo un error");
        return 0;     
    }
    else{
           return this.num1*this.num2;
    }
   
}
public double dividir(){
   if (this.num1==0 || this.num2==0){
        System.out.println("se produjo un error");
        return 0;     
    }
    else{
           return this.num1/this.num2;
    } 
}

}
