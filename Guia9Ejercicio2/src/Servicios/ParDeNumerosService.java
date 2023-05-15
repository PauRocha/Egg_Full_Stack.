/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import guia9ejercicio2.Entidades.ParDeNumeros;
import java.util.Scanner;


/**
 *
 * @author Rocha Paula
 *
 * . Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá
 * además implementar los siguientes métodos: Método mostrarValores que muestra
 * cuáles son los dos números guardados. Método devolverMayor para retornar cuál
 * de los dos atributos tiene el mayor valor Método calcularPotencia para
 * calcular la potencia del mayor valor de la clase elevado al menor número.
 * Previamente se deben redondear ambos valores. Método calculaRaiz, para
 * calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la
 * raíz cuadrada se debe obtener el valor absoluto del número.
 *
 */
public class ParDeNumerosService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ParDeNumeros p = new ParDeNumeros();

    //Método mostrarValores que muestra cuáles son los dos números guardados.
    public void mostrarValores() {

        System.out.println("Numero uno es: " + p.getNum1());
        System.out.println("Numero dos es: " + p.getNum2());
    }

    //Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor() {

        return Math.max(p.getNum1(), p.getNum2());
    }

    /*Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado 
* al menor número. Previamente se deben redondear ambos valores.*/
    public double calcularPotencia() {

        return Math.max(p.getNum1(), p.getNum2());

       
    }

    //Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
// Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.  
    public double calculaRaiz() {

        if (p.getNum1() > p.getNum2()) {

            return (double) Math.pow(p.getNum1(), p.getNum2());

        } else {

            return (double) Math.pow(p.getNum2(), p.getNum2());

        }
    }
}
