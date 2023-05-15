/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio2.Entidades;

/**
 *
 * @author Rocha Paula
 * 
 *  Realizar una clase llamada ParDeNumeros que tenga como 
     * atributos dos números reales con los cuales se realizarán diferentes 
     * operaciones matemáticas. La clase debe tener un constructor vacío, 
     * getters y setters.  En el constructor vacío se usará el Math.random 
     * para generar los dos números. 
 */
public class ParDeNumeros {
    private Double num1;
    private Double num2;
    
    //contructor vacio

    public ParDeNumeros() {
        this.num1 = (Math.random()*100);
        this.num2 = (Math.random()*100);
    }
    
    
    // Setter & Guetter

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }
    
    
}
