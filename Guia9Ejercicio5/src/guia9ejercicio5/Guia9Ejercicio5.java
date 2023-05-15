/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio5;

import Service.PersonaService;
import guia9ejercicio5.Entidad.Persona;
import java.util.Date;

/**
 *
 * @author Rocha Paula
 */
public class Guia9Ejercicio5 {

    /**
     * @param args the command line arguments
     *
     * Implemente la clase Persona en el paquete entidades. Una persona tiene un
     * nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
     * constructor parametrizado, get y set. Crear una clase PersonaService, en
     * el paquete servicio, con los siguientes métodos: Método crearPersona que
     * pida al usuario Nombre y fecha de nacimiento de la persona a crear.
     * Retornar el objeto Persona creado. Método calcularEdad que calcule la
     * edad del usuario utilizando el atributo de fecha de nacimiento y la fecha
     * actual. Método menorQue recibe como parámetro una Persona y una edad.
     * Retorna true si la persona es menor que la edad consultada o false en
     * caso contrario. Método mostrarPersona que muestra la información de la
     * persona deseada.
     *
     */
    public static void main(String[] args) {
        /* PersonaService p = new PersonaService();
        Date fecha = new Date();
        Persona pp = new Persona();
        p.crearPersona();
        
        p.mostrarPersona();*/

        PersonaService p1 = new PersonaService();
        Date fechaN = p1.crearPersona();
        Date fechaA = p1.fechaA();
        p1.calcularEdad(fechaA, fechaN);
        p1.menorQue();
        p1.mostrarPersona();
    }

}
